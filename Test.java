import java.util.ArrayList;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		ArrayList<Node> list = new ArrayList<>();
		Duple magAndCollegeCoord = new Duple(32.60655, -85.48173);
		Node magAndCollege = new Node(magAndCollegeCoord, "Magnolia and College");
		list.add(magAndCollege);
		Duple thatchAndSCollegeCoord = new Duple(32.60412, -85.48175);
		Node thatchAndSCollege = new Node(thatchAndSCollegeCoord, "Thatch and South College");
		list.add(thatchAndSCollege);
		Duple rooseveltMillerAndSCollegeCoord = new Duple(32.60137, -85.48177);
		Node rooseveltMillerAndSCollege = new Node(rooseveltMillerAndSCollegeCoord, "Roosevelt, Miller and South College");
		list.add(rooseveltMillerAndSCollege);
		Duple rooseveltAndMellCoord = new Duple(32.60109, -85.48388);
		Node rooseveltAndMell = new Node(rooseveltAndMellCoord, "Roosevelt and Mell");
		list.add(rooseveltAndMell);
		Duple eMagAndSGayCoord = new Duple(32.60655, -85.47989);
		Node eMagAndSGay = new Node(eMagAndSGayCoord, "East Magnolia and South Gay");
		list.add(eMagAndSGay);
		Duple tichAndNCollegeCoord = new Duple(32.60835, -85.48173);
		Node tichAndNCollege = new Node(tichAndNCollegeCoord, "Tichenor and North College");
		list.add(tichAndNCollege);
		Duple wMagAndDonCoord = new Duple(32.60637, -85.49039);
		Node wMagAndDon = new Node(wMagAndDonCoord, "West Magnolia and Donahue");
		list.add(wMagAndDon);
		Duple eThatchAndSGayCoord = new Duple(32.60422, -85.47991);
		Node eThatchAndSGay = new Node(eThatchAndSGayCoord, "East Thatch And South Gay");
		list.add(eThatchAndSGay);
		Duple millerAndSGayCoord = new Duple(32.60131, -85.47994);
		Node millerAndSGay = new Node(millerAndSGayCoord, "Miller and South Gay");
		list.add(millerAndSGay);
		Duple samfordAndSCollegeCoord = new Duple(32.59870, -85.48173);
		Node samfordAndSCollege = new Node(samfordAndSCollegeCoord, "Samford and South College");
		list.add(samfordAndSCollege);
		Duple eSamfordAndSGayCoord = new Duple(32.59870, -85.48173);
		Node eSamfordAndSGay = new Node(eSamfordAndSGayCoord, "East Samford and South Gay");
		list.add(eSamfordAndSGay);
		Duple wSamfordAndMellCoord = new Duple(32.59815, -85.48386);
		Node wSamfordAndMell = new Node(wSamfordAndMellCoord, "West Samford and Mell");
		list.add(wSamfordAndMell);
		Duple wSamfordAndDuncanCoord = new Duple(32.59802, -85.48775);
		Node wSamfordAndDuncan = new Node(wSamfordAndDuncanCoord, "West Samford and Duncan");
		list.add(wSamfordAndDuncan);
		Duple wSamfordAndSDonCoord = new Duple(32.59742, -85.49036);
		Node wSamfordAndSDon = new Node(wSamfordAndSDonCoord, "West Samford and South Donahue");
		list.add(wSamfordAndSDon);
		Duple heismanAndSDonCoord = new Duple(32.60105, -85.49047);
		Node heismanAndSDon = new Node(heismanAndSDonCoord, "Heisman and South Donahue");
		list.add(heismanAndSDon);
		Duple heismanBeardEavesAndSDonCoord = new Duple(32.60316, -85.49041);
		Node heismanBeardEavesAndSDon = new Node(heismanBeardEavesAndSDonCoord, "Heisman, Beard-Eaves and South Donahue");
		list.add(heismanBeardEavesAndSDon);
		Duple wEagleWayAndSDonCoord = new Duple(32.60481, -85.49042);
		Node wEagleWayAndSDon = new Node(wEagleWayAndSDonCoord, "War Eagle Way and South Donahue");
		list.add(wEagleWayAndSDon);
		Duple quadAndMellCoord = new Duple(32.60213, -85.48387);
		Node quadAndMell = new Node(quadAndMellCoord, "Quad Drive and Mell");
		list.add(quadAndMell);
		Duple quadEndCoord = new Duple(32.60215, -85.48584);
		Node quadEnd = new Node(quadEndCoord, "Quad Drive End");
		list.add(quadEnd);
		Duple bibbAndDuncanCoord = new Duple(32.59942, -85.48794);
		Node bibbAndDuncan = new Node(bibbAndDuncanCoord, "Bibb Graves and Duncan");
		list.add(bibbAndDuncan);
		Duple stadiumParkingDeckCoord = new Duple(32.60039, -85.48827);
		Node stadiumParkingDeck = new Node(stadiumParkingDeckCoord, "Stadium Parking Deck");
		list.add(stadiumParkingDeck);
		Duple wThatchEndCoord = new Duple(32.60410, -85.48422);
		Node wThatchEnd = new Node(wThatchEndCoord, "West Thatch End");
		list.add(wThatchEnd);
		Duple wSamfordAndDuggarCoord = new Duple(32.59810, -85.48553);
		Node wSamfordAndDuggar = new Node(wSamfordAndDuggarCoord, "West Samford and Duggar");
		list.add(wSamfordAndDuggar);
		Duple duggarEndCoord = new Duple(32.59869, -85.48556);
		Node duggarEnd = new Node(duggarEndCoord, "Duggar End");
		list.add(duggarEnd);
		Duple bibbGravesEndCoord = new Duple(32.59945, -85.48624);
		Node bibbGravesEnd = new Node(bibbGravesEndCoord, "Bibb Graves End");
		list.add(bibbGravesEnd);
		
		
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
		Random rand = new Random();
		Node start = list.get(rand.nextInt(list.size()));
		Node end = list.get(rand.nextInt(list.size()));
		ArrayList<Node> nodeList = algorithm.runAlgorithm(start, end);
		if (nodeList != null) {
			for (Node node : nodeList) {
				System.out.print(node.getName() + " -> ");
			}
		}
	}
	public ArrayList<Node> run() {
		ArrayList<Node> list = new ArrayList<>();
		Duple magAndCollegeCoord = new Duple(32.60655, -85.48173);
		Node magAndCollege = new Node(magAndCollegeCoord, "Magnolia and College");
		list.add(magAndCollege);
		Duple thatchAndSCollegeCoord = new Duple(32.60412, -85.48175);
		Node thatchAndSCollege = new Node(thatchAndSCollegeCoord, "Thatch and South College");
		list.add(thatchAndSCollege);
		Duple rooseveltMillerAndSCollegeCoord = new Duple(32.60137, -85.48177);
		Node rooseveltMillerAndSCollege = new Node(rooseveltMillerAndSCollegeCoord, "Roosevelt, Miller and South College");
		list.add(rooseveltMillerAndSCollege);
		Duple rooseveltAndMellCoord = new Duple(32.60109, -85.48388);
		Node rooseveltAndMell = new Node(rooseveltAndMellCoord, "Roosevelt and Mell");
		list.add(rooseveltAndMell);
		Duple eMagAndSGayCoord = new Duple(32.60655, -85.47989);
		Node eMagAndSGay = new Node(eMagAndSGayCoord, "East Magnolia and South Gay");
		list.add(eMagAndSGay);
		Duple tichAndNCollegeCoord = new Duple(32.60835, -85.48173);
		Node tichAndNCollege = new Node(tichAndNCollegeCoord, "Tichenor and North College");
		list.add(tichAndNCollege);
		Duple wMagAndDonCoord = new Duple(32.60637, -85.49039);
		Node wMagAndDon = new Node(wMagAndDonCoord, "West Magnolia and Donahue");
		list.add(wMagAndDon);
		Duple eThatchAndSGayCoord = new Duple(32.60422, -85.47991);
		Node eThatchAndSGay = new Node(eThatchAndSGayCoord, "East Thatch And South Gay");
		list.add(eThatchAndSGay);
		Duple millerAndSGayCoord = new Duple(32.60131, -85.47994);
		Node millerAndSGay = new Node(millerAndSGayCoord, "Miller and South Gay");
		list.add(millerAndSGay);
		Duple samfordAndSCollegeCoord = new Duple(32.59870, -85.48173);
		Node samfordAndSCollege = new Node(samfordAndSCollegeCoord, "Samford and South College");
		list.add(samfordAndSCollege);
		Duple eSamfordAndSGayCoord = new Duple(32.59870, -85.48173);
		Node eSamfordAndSGay = new Node(eSamfordAndSGayCoord, "East Samford and South Gay");
		list.add(eSamfordAndSGay);
		Duple wSamfordAndMellCoord = new Duple(32.59815, -85.48386);
		Node wSamfordAndMell = new Node(wSamfordAndMellCoord, "West Samford and Mell");
		list.add(wSamfordAndMell);
		Duple wSamfordAndDuncanCoord = new Duple(32.59802, -85.48775);
		Node wSamfordAndDuncan = new Node(wSamfordAndDuncanCoord, "West Samford and Duncan");
		list.add(wSamfordAndDuncan);
		Duple wSamfordAndSDonCoord = new Duple(32.59742, -85.49036);
		Node wSamfordAndSDon = new Node(wSamfordAndSDonCoord, "West Samford and South Donahue");
		list.add(wSamfordAndSDon);
		Duple heismanAndSDonCoord = new Duple(32.60105, -85.49047);
		Node heismanAndSDon = new Node(heismanAndSDonCoord, "Heisman and South Donahue");
		list.add(heismanAndSDon);
		Duple heismanBeardEavesAndSDonCoord = new Duple(32.60316, -85.49041);
		Node heismanBeardEavesAndSDon = new Node(heismanBeardEavesAndSDonCoord, "Heisman, Beard-Eaves and South Donahue");
		list.add(heismanBeardEavesAndSDon);
		Duple wEagleWayAndSDonCoord = new Duple(32.60481, -85.49042);
		Node wEagleWayAndSDon = new Node(wEagleWayAndSDonCoord, "War Eagle Way and South Donahue");
		list.add(wEagleWayAndSDon);
		Duple quadAndMellCoord = new Duple(32.60213, -85.48387);
		Node quadAndMell = new Node(quadAndMellCoord, "Quad Drive and Mell");
		list.add(quadAndMell);
		Duple quadEndCoord = new Duple(32.60215, -85.48584);
		Node quadEnd = new Node(quadEndCoord, "Quad Drive End");
		list.add(quadEnd);
		Duple bibbAndDuncanCoord = new Duple(32.59942, -85.48794);
		Node bibbAndDuncan = new Node(bibbAndDuncanCoord, "Bibb Graves and Duncan");
		list.add(bibbAndDuncan);
		Duple stadiumParkingDeckCoord = new Duple(32.60039, -85.48827);
		Node stadiumParkingDeck = new Node(stadiumParkingDeckCoord, "Stadium Parking Deck");
		list.add(stadiumParkingDeck);
		Duple wThatchEndCoord = new Duple(32.60410, -85.48422);
		Node wThatchEnd = new Node(wThatchEndCoord, "West Thatch End");
		list.add(wThatchEnd);
		Duple wSamfordAndDuggarCoord = new Duple(32.59810, -85.48553);
		Node wSamfordAndDuggar = new Node(wSamfordAndDuggarCoord, "West Samford and Duggar");
		list.add(wSamfordAndDuggar);
		Duple duggarEndCoord = new Duple(32.59869, -85.48556);
		Node duggarEnd = new Node(duggarEndCoord, "Duggar End");
		list.add(duggarEnd);
		Duple bibbGravesEndCoord = new Duple(32.59945, -85.48624);
		Node bibbGravesEnd = new Node(bibbGravesEndCoord, "Bibb Graves End");
		list.add(bibbGravesEnd);
		
		
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
		Random rand = new Random();
		Node start = list.get(rand.nextInt(list.size()));
		Node end = list.get(rand.nextInt(list.size()));
		
		// *** CHANGE ALGORITHM HERE ***
		ArrayList<Node> nodeList = algorithm.runAlgorithm(start, end);
		// *****************************
		
		if (nodeList != null) {
			for (Node node : nodeList) {
				//System.out.print(node.getName() + " -> ");
			}
		}
		return nodeList;
	}
}
