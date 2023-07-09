
public class MultiThreadingMain {

	public static void main(String[] args) {
		// crearing new stack of Thread type
		Banking bank = new Banking();// new stack created
		Addition add = new Addition();
		Printing print = new Printing();
		// creating the thread objects and giving references
		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(add);
		Thread t3 = new Thread(print);
		t1.start();
		t2.start();
		t3.start();
	}

}
