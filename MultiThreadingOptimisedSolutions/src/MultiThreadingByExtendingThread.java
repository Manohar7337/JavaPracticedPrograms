import java.util.Scanner;

class MultiThreading extends Thread {

	Scanner scan = new Scanner(System.in);

//we can also override the run() method before writing these all methods
	public void banking() {
		System.out.println("Banking Activity Started");
		System.out.println("enter the user name");
		String user = scan.next();
		System.out.println("enter the password");
		String pw = scan.next();
		System.out.println("collect your money \n Banking Activity endeds");
	}

	public void addition() {
		try {
			System.out.println("Addition Activity started");
			int a = 11;
			int b = 22;
			int c = a + b;
			Thread.sleep(2000);
			System.out.println("Result is " + c);
			System.out.println("Addition activity ended");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void printing() {
		System.out.println("printing activity started");
		try {
			for (int i = 1; i < 6; i++) {
				System.out.println(i + " printed");
				Thread.sleep(2000);
			}
			System.out.println("Printing activity ended");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("bank")) {
			banking();
		} else if (Thread.currentThread().getName().equals("add")) {
			addition();
		} else {
			printing();
		}
	}
}

public class MultiThreadingByExtendingThread {

	public static void main(String[] args) {
		// creating 3 extra stacks
		MultiThreading t1 = new MultiThreading();
		MultiThreading t2 = new MultiThreading();
		MultiThreading t3 = new MultiThreading();
		t1.setName("bank");
		t2.setName("add");
		t3.setName("print");
		// attaching it to Thread Scheduler
		t1.start();// start() is linked with run()
		t2.start();
		t3.start();

	}

}
