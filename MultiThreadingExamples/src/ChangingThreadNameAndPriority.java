
public class ChangingThreadNameAndPriority {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Thread name is "+t.getName());
		System.out.println("Thread priority is "+t.getPriority());
		t.setName("Kodnest");//we can change but cannot print here
		t.setPriority(7);
		System.out.println("Changed Thread name and priorities are: "+t);;
		
	}

}
