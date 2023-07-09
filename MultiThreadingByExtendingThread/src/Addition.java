
public class Addition extends Thread{
	@Override
	public void run() {
		System.out.println("Additon activity started");
		try {
		int a=1111;
		int b=2222;
		
			Thread.sleep(5000);
		 
		int result=a+b;
		System.out.println("Result is "+result);
		System.out.println("Addition activity ended");
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
