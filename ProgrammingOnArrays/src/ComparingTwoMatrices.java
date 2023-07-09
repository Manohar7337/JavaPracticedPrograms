import java.util.Scanner;
class Compare{
	public static String check(int mat1[][],int mat2[][],int row1,int row2,int col1,int col2){
	if(row1!=row2 || col1!=col2) {
		return "Matrices are not equal";
	}
	else {
		for(int i=0;i<row1;i++) {//row2 is also same
			for(int j=0;j<col1;j++) {//col2 is also same
				if(mat1[i][j]!=mat2[i][j]) {
					return "Matrices are not equal";
				}
				
			}
		}
	}
	return "Matrices are equal";
	}
}
public class ComparingTwoMatrices {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// creating a TWODimensional Matrix
	System.out.println("enter the no of rows of matrix 1");
	int rows1 = scan.nextInt();
	System.out.println("enter no of columns matrix 1");
	int columns1 = scan.nextInt();
	System.out.println("enter the no of rows of matrix 2");
	int rows2 = scan.nextInt();
	System.out.println("enter no of columns matrix 2");
	int columns2 = scan.nextInt();
	int mat1[][] = new int[rows1][columns1];
	int mat2[][] = new int[rows2][columns2];
	System.out.println("enter elements of Matrix1");
	for (int i = 0; i < rows1; i++) {
		for (int j = 0; j < columns1; j++) {
			mat1[i][j] = scan.nextInt();
		}
	}
	// Taking input for Matrix2
	System.out.println("enter elements of Matrix2");
	for (int i = 0; i < rows2; i++) {
		for (int j = 0; j < columns2; j++) {
			mat2[i][j] = scan.nextInt();
		}
	}
	System.out.println(Compare.check(mat1, mat2, rows1, rows2, columns1, columns2));
}
}
