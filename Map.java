import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {

   public Map() {}

   public static void main(String[] args) {

      try{

      Map m = new Map();
      File map = new File("./map.osm");
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(map);
      doc.getDocumentElement().normalize();

      NodeList nodes = doc.getElementsByTagName("node");
      NodeList ways = doc.getElementsByTagName("way");

      Intersection[] intersections = m.readInts(nodes, ways);
      
      for (Intersection i : intersections) {
         i.setNeighbors(m.findNeighbors(i, intersections, nodes, ways));
      }

      for (Intersection i : intersections) {
         System.out.println("Intersection:");
         System.out.print("\tRoads: ");
         for (String r : i.getRoads()) {
            System.out.print(r + ":");
         }
         System.out.println("\n\tLat: " + i.getCoords()[0]);
         System.out.println("\tLon: " + i.getCoords()[1]);
         for (Intersection j : i.getNeighbors()) {
            System.out.print(j.getId() + ":");
         }
         System.out.println("");
      }
      System.out.println(intersections.length + " intersections created.");
      
      FileOutputStream fos = new FileOutputStream("intersections.arr");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(intersections);
      oos.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   private String[] readRoads(NodeList ways, String id) {
      ArrayList<String> out = new ArrayList<String>();

      for (int i = 0; i < ways.getLength(); i++) {
                        Node way = ways.item(i);

                        if (way.getNodeType() == Node.ELEMENT_NODE) {
                                Element element = (Element) way;
                                for (int j = 0; j < element.getElementsByTagName("nd").getLength(); j++) {
                                        Element e = (Element) element.getElementsByTagName("nd").item(j);
                                        if (e.getAttribute("ref").equals(id)) {
                                                for (int k = 0; k < element.getElementsByTagName("tag").getLength(); k++) {
                                                   e = (Element) element.getElementsByTagName("tag").item(k);
                                                   if (e.getAttribute("k").equals("highway")) {
                                                      for (int l = 0; l < element.getElementsByTagName("tag").getLength(); l++) {
                                                         e = (Element) element.getElementsByTagName("tag").item(l);
                                                         if (e.getAttribute("k").equals("name")) {
                                                            if (!out.contains(e.getAttribute("v"))) {
                                                               out.add(e.getAttribute("v"));
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                        }
                                }
                        }
                }

      String[] arr = new String[out.size()];
      arr = out.toArray(arr);
      return arr;

   }

   private Intersection[] readInts(NodeList nodes, NodeList ways) {
      ArrayList<Intersection> out = new ArrayList<Intersection>();

      for (int i = 0; i < nodes.getLength(); i++) {
         Node intersect = nodes.item(i);
         String[] roads;

         if (intersect.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) intersect;
            String id = element.getAttribute("id");
            System.out.println("Reading roads for intersection " +  element.getAttribute("id"));
            roads = readRoads(ways, id);
            if (roads.length > 1) {
               String lat = element.getAttribute("lat");
               String lon = element.getAttribute("lon");
               out.add(new Intersection(id, roads, lat, lon));
            }
         }
      }
      Intersection[] arr = new Intersection[out.size()];
      arr = out.toArray(arr);
      return arr;
   }
   
   private ArrayList<Intersection> findNeighbors(Intersection intersection, Intersection[] intersections, NodeList nodes, NodeList ways) {
      ArrayList<Intersection> out = new ArrayList<Intersection>();
      
      for (int i = 0; i < ways.getLength(); i++) {
         Node way = ways.item(i);
         
         System.out.println("Finding neighbors loop " + i);
         
         boolean found = false;
         
         if (way.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) way;
            for (int j = 0; j < element.getElementsByTagName("nd").getLength(); j++) {
               Element e = (Element) element.getElementsByTagName("nd").item(j);
               if (e.getAttribute("ref").equals(intersection.getId())) {
                  // Check if intersection is the start of the road
                  if (j != 0) {
                     for (int k = j - 1; k >= 0; k--) {
                        e = (Element) element.getElementsByTagName("nd").item(k);
                        for (Intersection inter : intersections) {
                           if (e.getAttribute("ref").equals(inter.getId())) {
                              out.add(inter);
                              found = true;
                              break;
                           }
                        }
                        if (found) break;
                     }
                  }
                  
                  found = false;
                  // Check if intersection is the end of the road
                  if (j != element.getElementsByTagName("nd").getLength() - 1) {
                     for (int k = j + 1; k  < element.getElementsByTagName("nd").getLength(); k++) {
                        e = (Element) element.getElementsByTagName("nd").item(k);
                        for (Intersection inter : intersections) {
                           if (e.getAttribute("ref").equals(inter.getId())) {
                              out.add(inter);
                              found = true;
                              break;
                           }
                        }
                        if (found) break;
                     }
                  }
               }
            }
         }
      }
      
      return out;
   }

}