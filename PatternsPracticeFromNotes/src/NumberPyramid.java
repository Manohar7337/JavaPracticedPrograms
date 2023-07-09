/*
 * print the spaces first n-i related with n
 * print the row numbers with logic 1 st row 1 number ,2nd row 2 numbers
 * that is no of rows=no of columns logic
 * important thing is keep space after printing number.i.e (i+" ");
 */
public class NumberPyramid {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
