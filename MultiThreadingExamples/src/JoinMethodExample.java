import java.util.Scanner;

class Project implements Runnable{

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

		public void banking() {
			Scanner scan = new Scanner(System.in);
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
}
public class JoinMethodExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Activity started");
		Project p=new Project();
		//creating 3 extra stacks
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		t1.setName("bank");
		t2.setName("add");
		t3.setName("print");
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main Activity ended");
	}

}
