/*
 * here rows starts from 1 to 5
 * for 1st row only one column 
 * for 2nd row 2 columns
 * for 3rd row 3 colums
 * for 4th row 4 columns
 * for 5th row 5 colums
 * conclusion :no of rows == no of columns
 * so iterate j column from 1 and stop when it reaches no of rows
 * print the j value
 */
public class Pattern9 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
