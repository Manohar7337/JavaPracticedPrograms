/*
 * for first row 1 @ and *
 * for second row 2 @ and * 's
 * for third row 3 @'s and *'s
 * conclusion no of rows =no of @ and *
 */
public class Pattern15 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {// print only row no of @'s
				System.out.print("@");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
