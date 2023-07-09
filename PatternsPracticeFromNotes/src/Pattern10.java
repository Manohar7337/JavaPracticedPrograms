/*
 * rows starting from one and ending at 5 so rows increasing]
 * for 1st row 5 columns
 * for 2nd row 4 columns
 * for 3rd row 3 columns
 * for 4th row 2 columns
 * for 5th row 1 columns
 * we can see columns are decreasing for each increase in row
 */
public class Pattern10 {

	public static void main(String[] args) {
//start the columns for 1 to 5
		for (int i = 1; i <= 5; i++) {
			// decrease the columns from 5 to 1
			for (int j = 5; j >= i; j--) {
				System.out.print("$");
			}
			System.out.println();
		}
	}

}
