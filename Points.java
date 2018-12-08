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
	Duple magAndCollegeCoord = new Duple(32.60655, -85.48173);
	Duple thatchAndSCollegeCoord = new Duple(32.60412, -85.48175);
	Duple rooseveltMillerAndSCollegeCoord = new Duple(32.60137, -85.48177);
	Duple rooseveltAndMellCoord = new Duple(32.60109, -85.48388);
	Duple eMagAndSGayCoord = new Duple(32.60655, -85.47989);
	Duple tichAndNCollegeCoord = new Duple(32.60835, -85.48173);
	Duple wMagAndDonCoord = new Duple(32.60637, -85.49039);
	Duple eThatchAndSGayCoord = new Duple(32.60422, -85.47991);
	Duple millerAndSGayCoord = new Duple(32.60131, -85.47994);
	Duple samfordAndSCollegeCoord = new Duple(32.59870, -85.48173);
	Duple eSamfordAndSGayCoord = new Duple(32.59877, -85.47996);
	Duple wSamfordAndMellCoord = new Duple(32.59815, -85.48386);
	Duple wSamfordAndDuncanCoord = new Duple(32.59802, -85.48775);
	Duple wSamfordAndSDonCoord = new Duple(32.59742, -85.49036);
	Duple heismanAndSDonCoord = new Duple(32.60105, -85.49047);
	Duple heismanBeardEavesAndSDonCoord = new Duple(32.60316, -85.49041);
	Duple wEagleWayAndSDonCoord = new Duple(32.60481, -85.49042);
	Duple quadAndMellCoord = new Duple(32.60213, -85.48387);
	Duple quadEndCoord = new Duple(32.60215, -85.48584);
	Duple bibbAndDuncanCoord = new Duple(32.59942, -85.48794);
	Duple stadiumParkingDeckCoord = new Duple(32.60039, -85.48827);
	Duple wThatchEndCoord = new Duple(32.60410, -85.48422);
	Duple wSamfordAndDuggarCoord = new Duple(32.59810, -85.48553);
	Duple duggarEndCoord = new Duple(32.59869, -85.48556);
	Duple bibbGravesEndCoord = new Duple(32.59945, -85.48624);
	ArrayList<Duple> list = new ArrayList<>(Arrays.asList(magAndCollegeCoord, thatchAndSCollegeCoord,
			rooseveltMillerAndSCollegeCoord, rooseveltAndMellCoord, eMagAndSGayCoord, tichAndNCollegeCoord,
			wMagAndDonCoord, eThatchAndSGayCoord, millerAndSGayCoord, samfordAndSCollegeCoord, eSamfordAndSGayCoord,
			wSamfordAndMellCoord, wSamfordAndDuncanCoord, wSamfordAndSDonCoord, heismanAndSDonCoord,
			heismanBeardEavesAndSDonCoord, wEagleWayAndSDonCoord, quadAndMellCoord, quadEndCoord, bibbAndDuncanCoord,
			stadiumParkingDeckCoord, wThatchEndCoord, wSamfordAndDuggarCoord, duggarEndCoord, bibbGravesEndCoord));

	public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(Color.black);
    g2d.setStroke(new BasicStroke(10));

    for (Duple d : list) {
      Dimension size = getSize();
      int w = size.width ;
      int h = size.height;

      Duple duple = convert(d);
      int x = (int)duple.getX();
	  int y = (int)duple.getY();
      g2d.drawLine(x, y, x, y);
    }
    g2d.setStroke(new BasicStroke(3));
    plotLine(magAndCollegeCoord, thatchAndSCollegeCoord, g2d);
    plotLine(magAndCollegeCoord, eMagAndSGayCoord, g2d);
    plotLine(magAndCollegeCoord, wMagAndDonCoord, g2d);
    plotLine(thatchAndSCollegeCoord, eThatchAndSGayCoord, g2d);
    plotLine(thatchAndSCollegeCoord, wThatchEndCoord, g2d);
    plotLine(eMagAndSGayCoord, eThatchAndSGayCoord, g2d);
    plotLine(eThatchAndSGayCoord, millerAndSGayCoord, g2d);
    plotLine(rooseveltMillerAndSCollegeCoord, thatchAndSCollegeCoord,g2d);
    plotLine(rooseveltMillerAndSCollegeCoord, millerAndSGayCoord, g2d);
    plotLine(rooseveltAndMellCoord, rooseveltMillerAndSCollegeCoord, g2d);
    plotLine(rooseveltAndMellCoord, quadAndMellCoord, g2d);
    plotLine(samfordAndSCollegeCoord, rooseveltMillerAndSCollegeCoord, g2d);
    plotLine(eSamfordAndSGayCoord, millerAndSGayCoord, g2d);
    plotLine(wSamfordAndMellCoord, rooseveltAndMellCoord, g2d);
    plotLine(wSamfordAndMellCoord, wSamfordAndDuncanCoord, g2d);
    plotLine(samfordAndSCollegeCoord, wSamfordAndMellCoord, g2d);
    plotLine(samfordAndSCollegeCoord, eSamfordAndSGayCoord, g2d);
    plotLine(wSamfordAndDuncanCoord, wSamfordAndSDonCoord, g2d);
    plotLine(wSamfordAndSDonCoord, heismanAndSDonCoord, g2d);
    plotLine(heismanAndSDonCoord, heismanBeardEavesAndSDonCoord, g2d);
    plotLine(wEagleWayAndSDonCoord, heismanBeardEavesAndSDonCoord, g2d);
    plotLine(wEagleWayAndSDonCoord, wMagAndDonCoord, g2d);
    plotLine(quadAndMellCoord, quadEndCoord, g2d);
    plotLine(bibbAndDuncanCoord, wSamfordAndDuncanCoord, g2d);
    plotLine(bibbAndDuncanCoord, stadiumParkingDeckCoord, g2d);
    plotLine(bibbAndDuncanCoord, bibbGravesEndCoord, g2d);
    plotLine(wSamfordAndDuggarCoord, wSamfordAndMellCoord, g2d);
    plotLine(wSamfordAndDuggarCoord, wSamfordAndDuncanCoord, g2d);
    plotLine(wSamfordAndDuggarCoord, duggarEndCoord, g2d);
    
    g2d.setColor(Color.red);
    g2d.setStroke(new BasicStroke(5));
    Test test = new Test();
    ArrayList<Node> nodeList = test.run();
    for(int i = 0; i < nodeList.size() - 1; i++) {
    		Node node1 = nodeList.get(i);
    		Node node2 = nodeList.get(i+1);
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
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private Duple convert(Duple dupleIn) {
		double dx = ((dupleIn.getY() + 85.4912) / 0.0122) * 300;
		double dy = 250 - (((dupleIn.getX() - 32.5962) / 0.0111) * 250);
		return new Duple(dx, dy);
	}

	private void plotLine(Duple duple1, Duple duple2, Graphics2D g2d) {
		Duple converted1 = convert(duple1);
	  	int x1 = (int)converted1.getX();
	  	int y1 = (int)converted1.getY();
	  	Duple converted2 = convert(duple2);
	  	int x2 = (int)converted2.getX();
	  	int y2 = (int)converted2.getY();
	  	g2d.drawLine(x1, y1, x2, y2);
  }
}