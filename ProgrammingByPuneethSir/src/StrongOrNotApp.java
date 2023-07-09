import java.util.Scanner;

public class StrongOrNotApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scan.nextInt();
		StrongOrNot obj = new StrongOrNot();
		boolean res = obj.detectStrong(n);
		if (res == true) {
			System.out.println("entered number is strong");
		} else {
			System.out.println("entered number is not strong");
		}
		scan.close();
	}

}
