import java.util.Scanner;

public class HarshadApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		boolean result=HarshadOrNot.isHarshad(num);
		//System.out.println("result");
		if(result==true) {
			System.out.println("its a harshad number");
		}
		else
			System.out.println("Not Harshad");
	}

}
