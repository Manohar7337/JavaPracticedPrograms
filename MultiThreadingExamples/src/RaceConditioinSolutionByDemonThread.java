//Identify the background activities and make them infinite
class DemonThread1 extends Thread {
	public void run() {
		if (Thread.currentThread().getName().equals("print")) {
			try {
				printing();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (Thread.currentThread().getName().equals("spell")) {
			try {
				spellChecker();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				autoSaver();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void printing() throws InterruptedException {
		for (int i = 1; i < 5; i++) {
			System.out.println(i + " printing");
			Thread.sleep(2000);
		}
	}

	public void spellChecker() throws InterruptedException {
		for (;;) {//infinite loop
			System.out.println("Spell checking");
			Thread.sleep(2000);
		}
	}

	public void autoSaver() throws InterruptedException {
		for (;;) {//infiniteloop
			System.out.println("autoSaving");
			Thread.sleep(2000);
		}
	}
}

public class RaceConditioinSolutionByDemonThread {

	public static void main(String[] args) {
		// create 3 extra stacks
		DemonThread1 t1 = new DemonThread1();
		DemonThread1 t2 = new DemonThread1();
		DemonThread1 t3 = new DemonThread1();
		t1.setName("print");
		t2.setName("spell");
		t3.setName("save");
		//t2 and t3 will print infinity until foreground activity(printing) completes
		t2.setDaemon(true);
		t3.setDaemon(true);
		t2.setPriority(10);
		t3.setPriority(8);
		t1.start();
		t2.start();
		t3.start();
	}

}
