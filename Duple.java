
public class Duple {
	private double x;
	private double y;
	
	Duple(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Double distance(Duple duple2) {
		double xDif = x - duple2.getX();
		double yDif = y - duple2.getY();
		return Math.sqrt((xDif * xDif) + (yDif * yDif));
	}
}
