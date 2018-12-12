import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class AStar {
	PriorityQueue<NodeValue> open = new PriorityQueue<>();
	ArrayList<NodeValue> closed = new ArrayList<>();
	
	public ArrayList<Node> runAlgorithm(Node start, Node goal) {
		NodeValue startValue = new NodeValue(start, 0);
		open.add(startValue);
		
		//While open is not empty
		while(open.size() != 0) {
			
			//Pop minimum f(n) node and add it to closed
			NodeValue thisValue = open.poll();
			closed.add(thisValue);
			
			//Getting more info
			Node thisNode = thisValue.getNode();
			
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
				
				//Checks if the neighbor node is already somewhere in closed or open.
				//If so, sets found to true, and records the found node and node-value pair.
				boolean found = false;
				Node foundNode = null;
				NodeValue foundNodeValue = null;
				boolean foundInOpen = false;
				for (NodeValue closedNode : closed) {
					if (neighbor.getNode().equals(closedNode.getNode())) {
						found = true;
						foundNode = closedNode.getNode();
						foundNodeValue = closedNode;
					}
				}
				for (NodeValue openNode : open) {
					if (neighbor.getNode().equals(openNode.getNode())) {
						found = true;
						foundNode = openNode.getNode();
						foundNodeValue = openNode;
						foundInOpen = true;
					}
				}
				
				//If the successor is not on open or closed, estimate heuristic, get cost, calculate f(n),
				//and put on open.
				if (!found) {
					double heuristic = manhattanHeuristic(goal, neighbor);
					double cost = thisNode.getCost() + neighbor.getValue();
					double f = cost + heuristic;
					
					neighbor.getNode().setCost(cost);
					//Setting parent pointer back to original node
					neighbor.getNode().setParent(thisNode);
					
					NodeValue newPair = new NodeValue(neighbor.getNode(), f);
					open.add(newPair);
				} else {
					//If the successor is already on open or closed, check if cost is lower for this new version.
					double cost = thisNode.getCost() + neighbor.getValue();
					
					//If it is, set the new parent and cost, and add it to open.
					if (cost < foundNode.getCost()) {
						if (foundInOpen) {
							open.remove(foundNodeValue);
						} else {
							closed.remove(foundNodeValue);
						}
						
						neighbor.getNode().setParent(thisNode);
						neighbor.getNode().setCost(cost);
						
						double heuristic = manhattanHeuristic(goal, neighbor);
						double f = cost + heuristic;
						NodeValue newPair = new NodeValue(neighbor.getNode(), f);
						open.add(newPair);
					}
					//If cost is now lower, do nothing.
				}
			}
		}
		//exit with failure if not found by now
		return new ArrayList<Node>();
	}

	private double distanceHeuristic(Node goal, NodeValue neighbor) {
		double heuristic = 111000 * neighbor.getNode().getCoordinates().distance(goal.getCoordinates());
		return heuristic;
	}
	private double manhattanHeuristic(Node goal, NodeValue neighbor) {
		double xDistance = 111000 * Math.abs(neighbor.getNode().getCoordinates().getX() - goal.getCoordinates().getX());
		double yDistance = 111000 * Math.abs(neighbor.getNode().getCoordinates().getY() - goal.getCoordinates().getY());
		double heuristic = xDistance + yDistance;
		return heuristic;
	}
}
