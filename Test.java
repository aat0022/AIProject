import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Duple duple1 = new Duple(0, 0);
		Node node1 = new Node(duple1);
		Duple duple2 = new Duple(5, 0);
		Node node2 = new Node(duple2);
		Duple duple3 = new Duple(5, 5);
		Node node3 = new Node(duple3);
		Duple duple4 = new Duple(5, 10);
		Node node4 = new Node(duple4);
		
		node1.addNeighbor(node2, 5);
		node1.addNeighbor(node3, 7.07);
		node2.addNeighbor(node1, 5);
		node2.addNeighbor(node3, 5);
		node3.addNeighbor(node1, 7.07);
		node3.addNeighbor(node2, 5);
		node3.addNeighbor(node4, 5);
		node4.addNeighbor(node3, 5);
		
		AStar algorithm = new AStar();
		ArrayList<Node> nodeList = algorithm.runAlgorithm(node1, node4);
		if (nodeList != null) {
			for (Node node : nodeList) {
				System.out.print(" (" + node.getCoordinates().getX() + ", " + node.getCoordinates().getY()
						+ ") ->");
			}
		}
	}
}
