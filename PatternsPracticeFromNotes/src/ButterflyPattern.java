/*split the pattern into two parts 
 * in the first part 3 steps
 * step1: print the stars for increasing triangle
 * step2: print the stars for spaces multiples of 2
 * Step3: print the stars for increasing triangle
 * first print the stars ...no of rows=no of columns
 * print the spaces logic of space is multiple of 2 relate it with n.
 * print the stars again after spaces ...
 * ==================================================
 * in the second half we are taking i values comes in reverse order 5 4 3 2 1
 * so write the logic for rows(outer loop )in the reverse order
 * print the stars for row 5 stars are 5...no of rows = no of colums(same logic)
 * print the spaces(same logic for above) 
 * print the stars again
 * 
 */
public class ButterflyPattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			// inner loop to print stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// inner for loop to print spaces
			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			// inner loop to print stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i >= 1; i--) {
			// inner loop for printing stars
			for (int j = 1; j <= i; j++) {// i is 5 in first case
				System.out.print("*");
			}
			// inner loop for printing spaces
			int spaces = 2 * (n - i);// i=5 for 1st case so 0 stars will be printed
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			// inner loop for printing stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
