/*
 * divide the code into two parts
 */
public class Pattern18 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {//remove = symbol to remove middle repeated row
			for (int j = 1; j <= 5; j++) {
				System.out.print("+");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {// start from i=2 to remove repeated middle row
			for (int j = 1; j <= 5; j++) {
				System.out.print("+");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
