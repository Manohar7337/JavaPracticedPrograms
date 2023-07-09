
public class Printing implements Runnable {
	public void run() {
		System.out.println("Printing activity started");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " printed");
				Thread.sleep(5000);
			}
			System.out.println("Additon activit ended");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
