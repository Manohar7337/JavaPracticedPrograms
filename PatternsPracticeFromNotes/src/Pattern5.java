/*
 * print 5 stars for 5 rows 
 * and in the same loop add one more loop for dollar sign
 */
public class Pattern5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("$");
			}
			System.out.println();
		}

	}

}