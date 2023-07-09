import java.util.*;

public class Banking extends Thread {
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Banking Activity Started");
		System.out.println("enter the user name");
		String user=scan.next();
		System.out.println("enter the password");
		String pw=scan.next();
		System.out.println("collect your money \n Banking Activity endeds");
		
		}

}
