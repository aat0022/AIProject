import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Duple magAndCollegeCoord = new Duple(32.60655, -85.48173);
		Node magAndCollege = new Node(magAndCollegeCoord, "Magnolia and College");
		Duple thatchAndSCollegeCoord = new Duple(32.60412, -85.48175);
		Node thatchAndSCollege = new Node(thatchAndSCollegeCoord, "Thatch and South College");
		Duple rooseveltMillerAndSCollegeCoord = new Duple(32.60137, -85.48177);
		Node rooseveltMillerAndSCollege = new Node(rooseveltMillerAndSCollegeCoord, "Roosevelt, Miller and South College");
		Duple rooseveltAndMellCoord = new Duple(32.60109, -85.48388);
		Node rooseveltAndMell = new Node(rooseveltAndMellCoord, "Roosevelt and Mell");
		Duple eMagAndSGayCoord = new Duple(32.60655, -85.47989);
		Node eMagAndSGay = new Node(eMagAndSGayCoord, "East Magnolia and South Gay");
		Duple tichAndNCollegeCoord = new Duple(32.60835, -85.48173);
		Node tichAndNCollege = new Node(tichAndNCollegeCoord, "Tichenor and North College");
		Duple wMagAndDonCoord = new Duple(32.60637, -85.49039);
		Node wMagAndDon = new Node(wMagAndDonCoord, "West Magnolia and Donahue");
		Duple eThatchAndSGayCoord = new Duple(32.60422, -85.47991);
		Node eThatchAndSGay = new Node(eThatchAndSGayCoord, "East Thatch And South Gay");
		Duple millerAndSGayCoord = new Duple(32.60131, -85.47994);
		Node millerAndSGay = new Node(millerAndSGayCoord, "Miller and South Gay");
		Duple samfordAndSCollegeCoord = new Duple(32.59870, -85.48173);
		Node samfordAndSCollege = new Node(samfordAndSCollegeCoord, "Samford and South College");
		Duple eSamfordAndSGayCoord = new Duple(32.59870, -85.48173);
		Node eSamfordAndSGay = new Node(eSamfordAndSGayCoord, "East Samford and South Gay");
		Duple wSamfordAndMellCoord = new Duple(32.59815, -85.48386);
		Node wSamfordAndMell = new Node(wSamfordAndMellCoord, "West Samford and Mell");
		Duple wSamfordAndDuncanCoord = new Duple(32.59802, -85.48775);
		Node wSamfordAndDuncan = new Node(wSamfordAndDuncanCoord, "West Samford and Duncan");
		Duple wSamfordAndSDonCoord = new Duple(32.59742, -85.49036);
		Node wSamfordAndSDon = new Node(wSamfordAndSDonCoord, "West Samford and South Donahue");
		Duple heismanAndSDonCoord = new Duple(32.60105, -85.49047);
		Node heismanAndSDon = new Node(heismanAndSDonCoord, "Heisman and South Donahue");
		Duple heismanBeardEavesAndSDonCoord = new Duple(32.60316, -85.49041);
		Node heismanBeardEavesAndSDon = new Node(heismanBeardEavesAndSDonCoord, "Heisman, Beard-Eaves and South Donahue");
		Duple wEagleWayAndSDonCoord = new Duple(32.60481, -85.49042);
		Node wEagleWayAndSDon = new Node(wEagleWayAndSDonCoord, "War Eagle Way and South Donahue");
		Duple quadAndMellCoord = new Duple(32.60213, -85.48387);
		Node quadAndMell = new Node(quadAndMellCoord, "Quad Drive and Mell");
		Duple quadEndCoord = new Duple(32.60215, -85.48584);
		Node quadEnd = new Node(quadEndCoord, "Quad Drive End");
		Duple bibbAndDuncanCoord = new Duple(32.59942, -85.48794);
		Node bibbAndDuncan = new Node(bibbAndDuncanCoord, "Bibb Graves and Duncan");
		Duple stadiumParkingDeckCoord = new Duple(32.60039, -85.48827);
		Node stadiumParkingDeck = new Node(stadiumParkingDeckCoord, "Stadium Parking Deck");
		Duple wThatchEndCoord = new Duple(32.60410, -85.48422);
		Node wThatchEnd = new Node(wThatchEndCoord, "West Thatch End");
		Duple wSamfordAndDuggarCoord = new Duple(32.59810, -85.48553);
		Node wSamfordAndDuggar = new Node(wSamfordAndDuggarCoord, "West Samford and Duggar");
		Duple duggarEndCoord = new Duple(32.59869, -85.48556);
		Node duggarEnd = new Node(duggarEndCoord, "Duggar End");
		Duple bibbGravesEndCoord = new Duple(32.59945, -85.48624);
		Node bibbGravesEnd = new Node(bibbGravesEndCoord, "Bibb Graves End");
		
		
		magAndCollege.addNeighbor(thatchAndSCollege, 272);
		magAndCollege.addNeighbor(eMagAndSGay, 174);
		magAndCollege.addNeighbor(tichAndNCollege, 201);
		magAndCollege.addNeighbor(wMagAndDon, 814);
		thatchAndSCollege.addNeighbor(eThatchAndSGay, 173);
		thatchAndSCollege.addNeighbor(wThatchEnd, 306);
		eMagAndSGay.addNeighbor(eThatchAndSGay, 257);
		eThatchAndSGay.addNeighbor(millerAndSGay, 322);
		rooseveltMillerAndSCollege.addNeighbor(thatchAndSCollege, 306);
		rooseveltMillerAndSCollege.addNeighbor(millerAndSGay, 176);
		rooseveltAndMell.addNeighbor(rooseveltMillerAndSCollege, 201);
		rooseveltAndMell.addNeighbor(quadAndMell, 115);
		samfordAndSCollege.addNeighbor(rooseveltMillerAndSCollege, 295);
		eSamfordAndSGay.addNeighbor(millerAndSGay, 280);
		wSamfordAndMell.addNeighbor(rooseveltAndMell, 327);
		wSamfordAndMell.addNeighbor(wSamfordAndDuncan, 363);
		samfordAndSCollege.addNeighbor(wSamfordAndMell, 212);
		samfordAndSCollege.addNeighbor(eSamfordAndSGay, 166);
		wSamfordAndDuncan.addNeighbor(wSamfordAndSDon, 255);
		wSamfordAndSDon.addNeighbor(heismanAndSDon, 405);
		heismanAndSDon.addNeighbor(heismanBeardEavesAndSDon, 233);
		wEagleWayAndSDon.addNeighbor(heismanBeardEavesAndSDon, 183);
		wEagleWayAndSDon.addNeighbor(wMagAndDon, 172);
		quadAndMell.addNeighbor(quadEnd, 184);
		bibbAndDuncan.addNeighbor(wSamfordAndDuncan, 158);
		bibbAndDuncan.addNeighbor(stadiumParkingDeck, 121);
		bibbAndDuncan.addNeighbor(bibbGravesEnd, 165);
		wSamfordAndDuggar.addNeighbor(wSamfordAndMell, 153);
		wSamfordAndDuggar.addNeighbor(wSamfordAndDuncan, 210);
		wSamfordAndDuggar.addNeighbor(duggarEnd, 66);
		
		
		AStar algorithm = new AStar();
		ArrayList<Node> nodeList = algorithm.runAlgorithm(magAndCollege, bibbGravesEnd);
		if (nodeList != null) {
			for (Node node : nodeList) {
				System.out.print(node.getName() + " -> ");
			}
		}
	}
	public ArrayList<Node> run() {
		Duple magAndCollegeCoord = new Duple(32.60655, -85.48173);
		Node magAndCollege = new Node(magAndCollegeCoord, "Magnolia and College");
		Duple thatchAndSCollegeCoord = new Duple(32.60412, -85.48175);
		Node thatchAndSCollege = new Node(thatchAndSCollegeCoord, "Thatch and South College");
		Duple rooseveltMillerAndSCollegeCoord = new Duple(32.60137, -85.48177);
		Node rooseveltMillerAndSCollege = new Node(rooseveltMillerAndSCollegeCoord, "Roosevelt, Miller and South College");
		Duple rooseveltAndMellCoord = new Duple(32.60109, -85.48388);
		Node rooseveltAndMell = new Node(rooseveltAndMellCoord, "Roosevelt and Mell");
		Duple eMagAndSGayCoord = new Duple(32.60655, -85.47989);
		Node eMagAndSGay = new Node(eMagAndSGayCoord, "East Magnolia and South Gay");
		Duple tichAndNCollegeCoord = new Duple(32.60835, -85.48173);
		Node tichAndNCollege = new Node(tichAndNCollegeCoord, "Tichenor and North College");
		Duple wMagAndDonCoord = new Duple(32.60637, -85.49039);
		Node wMagAndDon = new Node(wMagAndDonCoord, "West Magnolia and Donahue");
		Duple eThatchAndSGayCoord = new Duple(32.60422, -85.47991);
		Node eThatchAndSGay = new Node(eThatchAndSGayCoord, "East Thatch And South Gay");
		Duple millerAndSGayCoord = new Duple(32.60131, -85.47994);
		Node millerAndSGay = new Node(millerAndSGayCoord, "Miller and South Gay");
		Duple samfordAndSCollegeCoord = new Duple(32.59870, -85.48173);
		Node samfordAndSCollege = new Node(samfordAndSCollegeCoord, "Samford and South College");
		Duple eSamfordAndSGayCoord = new Duple(32.59877, -85.47996);
		Node eSamfordAndSGay = new Node(eSamfordAndSGayCoord, "East Samford and South Gay");
		Duple wSamfordAndMellCoord = new Duple(32.59815, -85.48386);
		Node wSamfordAndMell = new Node(wSamfordAndMellCoord, "West Samford and Mell");
		Duple wSamfordAndDuncanCoord = new Duple(32.59802, -85.48775);
		Node wSamfordAndDuncan = new Node(wSamfordAndDuncanCoord, "West Samford and Duncan");
		Duple wSamfordAndSDonCoord = new Duple(32.59742, -85.49036);
		Node wSamfordAndSDon = new Node(wSamfordAndSDonCoord, "West Samford and South Donahue");
		Duple heismanAndSDonCoord = new Duple(32.60105, -85.49047);
		Node heismanAndSDon = new Node(heismanAndSDonCoord, "Heisman and South Donahue");
		Duple heismanBeardEavesAndSDonCoord = new Duple(32.60316, -85.49041);
		Node heismanBeardEavesAndSDon = new Node(heismanBeardEavesAndSDonCoord, "Heisman, Beard-Eaves and South Donahue");
		Duple wEagleWayAndSDonCoord = new Duple(32.60481, -85.49042);
		Node wEagleWayAndSDon = new Node(wEagleWayAndSDonCoord, "War Eagle Way and South Donahue");
		Duple quadAndMellCoord = new Duple(32.60213, -85.48387);
		Node quadAndMell = new Node(quadAndMellCoord, "Quad Drive and Mell");
		Duple quadEndCoord = new Duple(32.60215, -85.48584);
		Node quadEnd = new Node(quadEndCoord, "Quad Drive End");
		Duple bibbAndDuncanCoord = new Duple(32.59942, -85.48794);
		Node bibbAndDuncan = new Node(bibbAndDuncanCoord, "Bibb Graves and Duncan");
		Duple stadiumParkingDeckCoord = new Duple(32.60039, -85.48827);
		Node stadiumParkingDeck = new Node(stadiumParkingDeckCoord, "Stadium Parking Deck");
		Duple wThatchEndCoord = new Duple(32.60410, -85.48422);
		Node wThatchEnd = new Node(wThatchEndCoord, "West Thatch End");
		Duple wSamfordAndDuggarCoord = new Duple(32.59810, -85.48553);
		Node wSamfordAndDuggar = new Node(wSamfordAndDuggarCoord, "West Samford and Duggar");
		Duple duggarEndCoord = new Duple(32.59869, -85.48556);
		Node duggarEnd = new Node(duggarEndCoord, "Duggar End");
		Duple bibbGravesEndCoord = new Duple(32.59945, -85.48624);
		Node bibbGravesEnd = new Node(bibbGravesEndCoord, "Bibb Graves End");
		
		
		magAndCollege.addNeighbor(thatchAndSCollege, 272);
		magAndCollege.addNeighbor(eMagAndSGay, 174);
		magAndCollege.addNeighbor(tichAndNCollege, 201);
		magAndCollege.addNeighbor(wMagAndDon, 814);
		thatchAndSCollege.addNeighbor(eThatchAndSGay, 173);
		thatchAndSCollege.addNeighbor(wThatchEnd, 306);
		eMagAndSGay.addNeighbor(eThatchAndSGay, 257);
		eThatchAndSGay.addNeighbor(millerAndSGay, 322);
		rooseveltMillerAndSCollege.addNeighbor(thatchAndSCollege, 306);
		rooseveltMillerAndSCollege.addNeighbor(millerAndSGay, 176);
		rooseveltAndMell.addNeighbor(rooseveltMillerAndSCollege, 201);
		rooseveltAndMell.addNeighbor(quadAndMell, 115);
		samfordAndSCollege.addNeighbor(rooseveltMillerAndSCollege, 295);
		eSamfordAndSGay.addNeighbor(millerAndSGay, 280);
		wSamfordAndMell.addNeighbor(rooseveltAndMell, 327);
		wSamfordAndMell.addNeighbor(wSamfordAndDuncan, 363);
		samfordAndSCollege.addNeighbor(wSamfordAndMell, 212);
		samfordAndSCollege.addNeighbor(eSamfordAndSGay, 166);
		wSamfordAndDuncan.addNeighbor(wSamfordAndSDon, 255);
		wSamfordAndSDon.addNeighbor(heismanAndSDon, 405);
		heismanAndSDon.addNeighbor(heismanBeardEavesAndSDon, 233);
		wEagleWayAndSDon.addNeighbor(heismanBeardEavesAndSDon, 183);
		wEagleWayAndSDon.addNeighbor(wMagAndDon, 172);
		quadAndMell.addNeighbor(quadEnd, 184);
		bibbAndDuncan.addNeighbor(wSamfordAndDuncan, 158);
		bibbAndDuncan.addNeighbor(stadiumParkingDeck, 121);
		bibbAndDuncan.addNeighbor(bibbGravesEnd, 165);
		wSamfordAndDuggar.addNeighbor(wSamfordAndMell, 153);
		wSamfordAndDuggar.addNeighbor(wSamfordAndDuncan, 210);
		wSamfordAndDuggar.addNeighbor(duggarEnd, 66);
		
		
		AStar algorithm = new AStar();
		ArrayList<Node> nodeList = algorithm.runAlgorithm(eMagAndSGay, quadEnd);
		if (nodeList != null) {
			for (Node node : nodeList) {
				System.out.print(node.getName() + " -> ");
			}
		}
		return nodeList;
	}
}
