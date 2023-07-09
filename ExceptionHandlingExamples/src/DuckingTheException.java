import java.util.Scanner;

/*Ducking the exception is nothing but leaving the exception 
  without handling*/
class ATM1 {
	public void withdraw() throws Exception {
		System.out.println("Connection 1 established");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter accno and pwd");
			int accNo = scan.nextInt();
			int pwd = scan.nextInt();
			int res = accNo / pwd;
			System.out.println("Take your money " + res);

		} finally {
			System.out.println("Connection 1 terminated");
		}

	}
}
class Bank1{
	public void initiate() {
		System.out.println("Connection 2 established");
		ATM1 atm=new ATM1();
		try {
			atm.withdraw();
		}catch(Exception e) {
			System.out.println("issue reached bank and count incremented");
		}
		System.out.println("connection 2 terminated");
	}
}

public class DuckingTheException {

	public static void main(String[] args) {
		System.out.println("Main connection established");
		Bank1 bank=new Bank1();
		bank.initiate();
		System.out.println("Main connection terminated");
	}

}
