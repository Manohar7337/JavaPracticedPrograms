import java.util.Scanner;

public class DiagonalOfMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// creating a TWODimensional Matrix
		System.out.println("enter the no of rows");
		int rows = scan.nextInt();
		System.out.println("enter no of columns");
		int columns = scan.nextInt();

		int mat1[][] = new int[rows][columns];
		int sum = 0;
		int sum2 = 0;

		// Taking input for Matrix1
		System.out.println("enter elements of Matrix1");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				mat1[i][j] = scan.nextInt();
			}
		}

		// Display matrix1
		System.out.println("values of matrix 2:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}
		// Diagonal elements
		System.out.println("Diagonal elements are");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == j) {
					//System.out.print(mat1[i][j] + " ");
					sum = sum + mat1[i][j];
				}
				System.out.println();
				// reverse Diagonal elements
				if (i + j == 2) {
					
					//System.out.println(mat1[i][j]);
					sum2 = sum2 + mat1[i][j];
				}
			}
			System.out.println();

		}
		
		System.out.println("sum of diagonal elements:" + sum);
		System.out.println("sum of reverse diagonal elements:" + sum2);
	}

}
