import java.util.*;

public class PrimeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		PrimeOrNot obj = new PrimeOrNot();
		boolean res = obj.isPrime(num);
		if (res == true) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
		scan.close();

	}

}
