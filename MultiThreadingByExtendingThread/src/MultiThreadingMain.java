
public class MultiThreadingMain {

	public static void main(String[] args) {
		// create extra stacks by
		// creating the object of thread type
		Banking t1 = new Banking();// extra stack created
		Addition t2 = new Addition();// extra stack created
		Printing t3 = new Printing();// extra stack created
		t1.start();
		t2.start();
		t3.start();
	}

}
