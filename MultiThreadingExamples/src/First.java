//This program will give us an idea which thread is running
//what is its priority and in which method its running
public class First {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("This line is executed by "+t);
		// to check the name of thread
		System.out.println(t.getName());
		//to check the priority of the thread
		System.out.println(t.getPriority());
		
	}

}
