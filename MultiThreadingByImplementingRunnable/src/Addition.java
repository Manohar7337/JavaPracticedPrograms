
public class Addition implements Runnable {
	@Override
	public void run() {
		System.out.println("Addition Activity started");
		try {
			int a = 111;
			int b = 222;
			Thread.sleep(5000);
			int c = a + b;
			System.out.println("Addition is " + c);
			System.out.println("Addition activity ended");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
