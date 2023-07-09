//This is the problem solution will be in nextProgram
//Threads will be in a race to execute
class DemonThread extends Thread {
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
		for (int i = 0; i < 5; i++) {
			System.out.println("Spell checking");
			Thread.sleep(2000);
		}
	}

	public void autoSaver() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("autoSaving");
			Thread.sleep(2000);
		}
	}
}

public class RaceConditionProblem1 {

	public static void main(String[] args) {
		// create 3 extra stacks by thread types
		DemonThread t1 = new DemonThread();
		DemonThread t2 = new DemonThread();
		DemonThread t3 = new DemonThread();
		t1.setName("print");
		t2.setName("spell");
		t3.setName("save");
		t1.start();
		t2.start();
		t3.start();
	}

}
