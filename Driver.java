import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Node> list = getList();
		
		AStar algorithm = new AStar();
		Random rand = new Random();
		Node start = list.get(rand.nextInt(list.size()));
		Node end = list.get(rand.nextInt(list.size()));
		ArrayList<Node> nodeList = algorithm.runAlgorithm(start, end);
		if (nodeList != null) {
			for (Node node : nodeList) {
				System.out.print(node.getName() + " -> ");
			}
		}
	}
	
	public ArrayList<Node> run() {
		ArrayList<Node> list = getList();
		
		Random rand = new Random();
		Node start = list.get(rand.nextInt(list.size()));
		Node end = list.get(rand.nextInt(list.size()));
		
		// *** CHANGE ALGORITHM HERE ***
		AStar algorithm = new AStar();
		ArrayList<Node> nodeList = algorithm.runAlgorithm(start, end);
		// *****************************
		
		return nodeList;
	}

	public static ArrayList<Node> getList() {
		ArrayList<Node> list = new ArrayList<>();
		try {

			FileInputStream fis = new FileInputStream("intersections.arr");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Intersection[] intersections = (Intersection[]) ois.readObject();

			for (int i = 0; i < intersections.length; i++) {
				Duple coord = new Duple(intersections[i].getCoords()[0], intersections[i].getCoords()[1]);
				Node n = new Node(coord, intersections[i].getId());
				list.add(n);
			}

			for (int i = 0; i < intersections.length; i++) {
				for (Node n : list) {
					if (n.getName().equals(intersections[i].getId())) {
						for (Intersection neighbor : intersections[i].getNeighbors()) {
							for (Node m : list) {
								if (m.getName().equals(neighbor.getId())) {
									n.addNeighbor(m, n.getCoordinates().distance(m.getCoordinates()));
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
