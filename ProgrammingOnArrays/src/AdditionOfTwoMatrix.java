
// Addition , Substraction, Division same only symbol is changed
import java.util.Scanner;

public class AdditionOfTwoMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// creating a TWODimensional Matrix
		System.out.println("enter the no of rows");
		int rows = scan.nextInt();
		System.out.println("enter no of columns");
		int columns = scan.nextInt();

		int mat1[][] = new int[rows][columns];
		int mat2[][] = new int[rows][columns];
		int mat3[][] = new int[rows][columns];

		// Taking input for Matrix1
		System.out.println("enter elements of Matrix1");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				mat1[i][j] = scan.nextInt();
			}
		}
		// Taking input for Matrix2
		System.out.println("enter elements of Matrix2");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				mat2[i][j] = scan.nextInt();
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
		// Display Matrix2
		System.out.println("values of matrix 2:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println();
		}
		// Addition of Two Matrices
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];// Substraction is also same use - symbol
				// use / for division same code
			}
		}
		// Print the resultant matrix
		System.out.println("The resultant matrix is");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
