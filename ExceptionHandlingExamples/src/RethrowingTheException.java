
import java.util.Scanner;

class ATM{
	public void withdraw() throws Exception{
		System.out.println("Connection 1 established");
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter 2 numbers");
			int acc=scan.nextInt();
			int pwd=scan.nextInt();
			int res=acc/pwd;
			System.out.println("Take your money");
			//catch block will get executed only if exception occurs in try block
		}catch(Exception e){
			System.out.println("Exception occured and resolved in ATM");
			throw e;
		}
		//mandatory stmts should be written in finally block
		//it will execute if exception occurs or not
		finally {
			System.out.println("Connection 1 terminated");
		}
	}
}
	class Bank{
		public void initiate() {
			System.out.println("connection 2 initiated");
			try {
				ATM atm=new ATM();
				atm.withdraw();
			}
			catch(Exception e) {
				System.out.println("Issue reached bank and count incremented");
			}
			System.out.println("Connection 2 terminated");
		}
	}

public class RethrowingTheException {

	public static void main(String[] args) {
		System.out.println("Main connection established");
		Bank bank=new Bank();
		bank.initiate();
		System.out.println("Main connection terminated");
		
	}

}
