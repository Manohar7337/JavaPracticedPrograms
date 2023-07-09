
public class Printing extends Thread {

	@Override
	public void run() {
		System.out.println("Printing Activity Started");
		// we need to handle the exception because we are using the sleep method
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + " printed");
				Thread.sleep(5000);

			}
			System.out.println("Printing Activity ended");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
