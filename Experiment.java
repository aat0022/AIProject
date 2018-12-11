
public class Experiment {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		Driver test = new Driver();
		for (int x = 0; x < 100; x++) {
			test.run();
			System.out.println(x);
		}
		long time2 = System.currentTimeMillis();
		long experimentTime = time2 - time1;
		System.out.println("Time in milliseconds for 100 runs: " + experimentTime);
	}
}
