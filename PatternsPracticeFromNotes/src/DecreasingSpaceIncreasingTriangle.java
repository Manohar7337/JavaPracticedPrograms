/*
 * same program what we have practiced in the 17th pattern
 * but here we are taking n no of rows so printing n-1 spaces in the first row
 * and 1 star in the first  row.. so becomes n 
 */
public class DecreasingSpaceIncreasingTriangle {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			// code to decrease spaces
			/*
			 * we are just printing 4 spaces and 1 star simple code no need to panic
			 */
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {//print the stars equal to row number
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
