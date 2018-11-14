/**
 * This represents a node and a value paired together.
 * @author Alexis
 *
 */
public class NodeValue implements Comparable<NodeValue>{
	private Node node;
	private double value;
	
	public NodeValue(Node nodeIn, double valueIn) {
		node = nodeIn;
		value = valueIn;
	}
	
	public Node getNode() {
		return node;
	}
	public void setNode(Node in) {
		node = in;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double in) {
		value = in;
	}
	
	public int compareTo(NodeValue o) {
		if (value < o.getValue()) {
			return -1;
		} else if (value > o.getValue()) {
			return 1;
		}
		return 0;
	}
}
