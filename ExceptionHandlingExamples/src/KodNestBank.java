//This is the Example of customising the Exception
import java.util.Scanner;
class InvalidAccNoOrPasswordException extends Exception{
	@Override
	public String getMessage() {
		return "InvalidAccNoOrPasswordException";
	}
	
}

class Customer{
	private int accNo=1111;
	private int pwd=2222;
	int userAccNo;
	int userPwd;
	public void acceptinput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter userName and password");
		userAccNo=scan.nextInt();
		userPwd=scan.nextInt();
	}
	public void verify() throws InvalidAccNoOrPasswordException {
		
		if(userAccNo==accNo && userPwd==pwd) {
			System.out.println("Take your money");
		}
		
		else {
			InvalidAccNoOrPasswordException iape=new InvalidAccNoOrPasswordException();
			System.out.println(iape.getMessage()); 
			throw iape;
			}
			
		}
	}
class Bank2{
	public void acceptCustomer() {
		Customer c=new Customer();
		try {
			c.acceptinput();
			c.verify();
		}
		catch(Exception e1){
			System.out.println("1st invalid input try again");
			try {
				c.acceptinput();
				c.verify();
			}
			catch(Exception e2) {
				System.out.println("2nd invalid input try again");
				try {
					c.acceptinput();
					c.verify();
				}
				catch(Exception e){
					System.out.println("Account blocked visit the nearest bank");
					
				}
			}
		}
	}
}

public class KodNestBank {

	public static void main(String[] args) {
		Bank2 bank=new Bank2();
		bank.acceptCustomer();
	}

}
