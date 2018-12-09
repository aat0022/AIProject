import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class BFS {
	LinkedList<Node> open = new LinkedList<>();
	ArrayList<Node> closed = new ArrayList<>();

	public ArrayList<Node> runAlgorithm(Node start, Node goal) {
		open.add(start);
		
		//While open is not empty
		while(open.size() != 0) {
			
			//Dequeue node and add it to closed
			Node thisNode = open.poll();
			closed.add(thisNode);
			
			//If this node is the goal node
			if (thisNode.equals(goal)) {
				//Exit: trace back through parents to create a path
				boolean done = false;
				Node currentNode = thisNode;
				ArrayList<Node> path = new ArrayList<>();
				
				while (!done) {
					if (currentNode.getParent() == null) {
						path.add(currentNode);
						done = true;
					} else {
						path.add(currentNode);
						currentNode = currentNode.getParent();
					}
				}
				Collections.reverse(path);
				return path;
			}
			
			ArrayList<NodeValue> neighbors = thisNode.getNeighborList();
			
			//Expand all successors
			for(NodeValue neighbor : neighbors) {
				Node neighborNode = neighbor.getNode();

				//If the successor is not on open or closed, queue.
				if (!open.contains(neighborNode) && !closed.contains(neighborNode)) {
					neighborNode.setParent(thisNode);
					open.add(neighborNode);
				}
			}
		}
		//exit with failure if not found by now
		return new ArrayList<Node>();
	}
}
