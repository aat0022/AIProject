import java.util.ArrayList;
import java.util.Collections;

/**
 * This represents a node in a graph.
 * @author Alexis
 *
 */
public class Node {
	//Name of node
	private String name;
	//List of adjacent nodes in node-weight pairs
	private ArrayList<NodeValue> neighborList = new ArrayList<>();
	//Node coordinates
	private Duple coordinates;
	//Parent node
	private Node parent = null;
	//Cost to reach
	private double cost = 0;
	
	//Multiple constructors for convenience. I expect to use the second one the most.
	public Node (String nameIn, ArrayList<NodeValue> listIn, Duple coordinatesIn, Node parentIn, double costIn) {
		name = nameIn;
		neighborList = listIn;
		coordinates = coordinatesIn;
		parent = parentIn;
		cost = costIn;
		Collections.sort(neighborList);
	}
	public Node (Duple coordinatesIn, String nameIn) {
		coordinates = coordinatesIn;
		name = nameIn;
	}
	public Node(Duple coordinatesIn) {
		coordinates = coordinatesIn;
	}
	public Node() {
		
	}
	
	//Two methods of input for convenience
	public void addNeighbor(Node node, double weight) {
		NodeValue added = new NodeValue(node, weight);
		NodeValue otherAdded = new NodeValue(this, weight);
		neighborList.add(added);
		node.getNeighborList().add(otherAdded);
		Collections.sort(neighborList);
		Collections.sort(node.getNeighborList());
	}
	public void addNeighbor(NodeValue in) {
		neighborList.add(in);
		NodeValue otherAdded = new NodeValue(this, in.getValue());
		in.getNode().getNeighborList().add(otherAdded);
		Collections.sort(neighborList);
		Collections.sort(in.getNode().getNeighborList());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String in) {
		name = in;
	}
	public ArrayList<NodeValue> getNeighborList() {
		return neighborList;
	}
	public void setNeighborList(ArrayList<NodeValue> in) {
		neighborList = in;
		Collections.sort(neighborList);
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
