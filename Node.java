import java.util.ArrayList;

/**
 * This represents a node in a graph.
 * @author Alexis
 *
 */
public class Node {
	//List of adjacent nodes in node-weight pairs
	private ArrayList<NodeValue> neighborList = new ArrayList<>();
	//Node coordinates
	private Duple coordinates;
	//Parent node
	private Node parent = null;
	//Cost to reach
	private double cost = 0;
	
	//Multiple constructors for convenience. I expect to use the second one the most.
	public Node (ArrayList<NodeValue> listIn, Duple coordinatesIn, Node parentIn, double costIn) {
		neighborList = listIn;
		coordinates = coordinatesIn;
		parent = parentIn;
		cost = costIn;
	}
	public Node(Duple coordinatesIn) {
		coordinates = coordinatesIn;
	}
	public Node() {
		
	}
	
	//Two methods of input for convenience
	public void addNeighbor(Node node, double weight) {
		NodeValue added = new NodeValue(node, weight);
		neighborList.add(added);
	}
	public void addNeighbor(NodeValue in) {
		neighborList.add(in);
	}
	
	public ArrayList<NodeValue> getNeighborList() {
		return neighborList;
	}
	public void setNeighborList(ArrayList<NodeValue> in) {
		neighborList = in;
	}
	public Duple getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Duple in) {
		coordinates = in;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node in) {
		parent = in;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double in) {
		cost = in;
	}
	
	//careful of infinite loop. If infinite loop, remove neighborList from comparison.
	public boolean equals(Node in) {
		if (coordinates.getX() == in.getCoordinates().getX() && coordinates.getY() == in.getCoordinates().getY()
				&& neighborList.equals(in.getNeighborList())) {
			return true;
		}
		return false;
	}
}
