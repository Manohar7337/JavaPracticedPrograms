/*
 * print five cap symbols for each row
 * start printing stars from 5 to 1 in the same row..that means iterate in reverse order
 */
public class Pattern16 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {// print 5 caps for each row
				System.out.print("^");
			}
			// if we use k>=1 in the below case it will print all 5 stars for every row
			// we don't want all 5 stars in every row
			for (int k = 5; k >= i; k--) {// k should iterete only upto i values
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
