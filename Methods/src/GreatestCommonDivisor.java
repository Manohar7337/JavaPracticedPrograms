import java.util.Scanner;

public class GreatestCommonDivisor {
	int findGcd(int m, int n) {
		while (n != 0) {
			int rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int m = scan.nextInt();
		int n = scan.nextInt();
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		int res = gcd.findGcd(m, n);
		System.out.println("GCD OF 2 NUMBERS " + m + " AND " + n + " IS " + res);
		scan.close();
	}

}
