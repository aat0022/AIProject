import java.io.Serializable;
import java.util.ArrayList;

public class Intersection implements Serializable {

   private static final long serialVersionUID = 1L;

	private String id;
   private String[] roads;
	private float latitude, longitude;
   private ArrayList<Intersection> neighbors = new ArrayList<Intersection>();

	public Intersection(String d, String[] r, String lat, String lon) {
		id = d;
      roads = r;
		latitude = Float.parseFloat(lat);
		longitude = Float.parseFloat(lon);
		for (String i : roads) {
			System.out.print("\t" + i + " : ");
		}
		System.out.println("\n\t" + lat);
		System.out.println("\t" + lon);
	}

   public String getId() { return id; }
	public float[] getCoords() { return new float[] {latitude, longitude}; }
	public String[] getRoads() { return roads; }
   
   public void setNeighbors(ArrayList<Intersection> n) {
      neighbors = n;
   }
   
   public void addNeighbor(Intersection n) {
      neighbors.add(n);
   }
   
   public ArrayList<Intersection> getNeighbors() { return neighbors; }
}
