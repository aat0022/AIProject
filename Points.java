import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Points extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(10));

		ArrayList<Node> list = Driver.getList();
		for (Node d : list) {
			Duple duple = convert(d.getCoordinates());
			int x = (int) duple.getX();
			int y = (int) duple.getY();
			g2d.drawLine(x, y, x, y);
		}
		g2d.setStroke(new BasicStroke(3));
		for (Node n : list) {
			Duple d1 = n.getCoordinates();
			for (NodeValue neighbor : n.getNeighborList()) {
				Duple d2 = neighbor.getNode().getCoordinates();
				plotLine(d1, d2, g2d);
			}
		}

		g2d.setColor(Color.red);
		g2d.setStroke(new BasicStroke(5));
		Driver test = new Driver();
		ArrayList<Node> nodeList = test.run();
		for (int i = 0; i < nodeList.size() - 1; i++) {
			Node node1 = nodeList.get(i);
			Node node2 = nodeList.get(i + 1);
			Duple duple1 = node1.getCoordinates();
			Duple duple2 = node2.getCoordinates();

			plotLine(duple1, duple2, g2d);
		}
	}

	public static void main(String[] args) {
		Points points = new Points();
		JFrame frame = new JFrame("Points");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(points);
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private Duple convert(Duple dupleIn) {
		double dx = ((dupleIn.getY() + 85.5267) / 0.0924) * 800;
		double dy = 800 - (((dupleIn.getX() - 32.5755) / 0.0646) * 800);
		return new Duple(dx, dy);
	}

	private void plotLine(Duple duple1, Duple duple2, Graphics2D g2d) {
		Duple converted1 = convert(duple1);
		int x1 = (int) converted1.getX();
		int y1 = (int) converted1.getY();
		Duple converted2 = convert(duple2);
		int x2 = (int) converted2.getX();
		int y2 = (int) converted2.getY();
		g2d.drawLine(x1, y1, x2, y2);
	}
}