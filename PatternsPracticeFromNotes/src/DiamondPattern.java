/*
 * Divide the pattern into 2 parts (horizintally)
 * upperpart:
 * iterating from 1 to n
 * print n-i spaces
 * print 2*i-1 stars
 * =========================================
 * lowerpart:
 * iterating from n to 1
 * print n-i spaces
 * print 2*i-1 stars
 */
public class DiamondPattern {

	public static void main(String[] args) {
		int n = 4;
		// itereting from 1 to n
		for (int i = 1; i <= n; i++) {// if we want to remove the innerline i<n
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 2 nd part iterating the loop from n to 1
		for (int i = n; i >= 1; i--) {// if we want to remove the inner line i=n-1
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
