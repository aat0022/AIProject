
public class Experiment {
	public static void main(String[] args) {
		Driver test = new Driver();
		for (int y = 0; y < 10; y++) {
			long time1 = System.currentTimeMillis();
			for (int x = 0; x < 100; x++) {
				test.run();
			}
			long time2 = System.currentTimeMillis();
			long experimentTime = time2 - time1;
			System.out.print(experimentTime + ", ");
		}
	}
}
