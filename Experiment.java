
public class Experiment {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		Test test = new Test();
		for (int x = 0; x < 10000; x++) {
			test.run();
		}
		long time2 = System.currentTimeMillis();
		long experimentTime = time2 - time1;
		System.out.println("Time in milliseconds for 10000 runs: " + experimentTime);
	}
}
