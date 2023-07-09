/*
 * split the pattern into two parts
 * for first part 5 rows decrease the columns from 5 to 1
 * for 2nd part 5 rows increase the columns as equal to no of rows
 */
public class Pattern20 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// use i<5 for removing the inner repeating row
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("$");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {// start the loop from 2 to remove the inner row
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}

}
