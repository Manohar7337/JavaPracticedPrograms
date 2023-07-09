import java.util.Scanner;

class Multiplication {
	public static void multiply(int Matrix1[][],int Matrix2[][],int Result[][],int mr1,int mc2) {
		int row1=Matrix1.length;
		int row2=Matrix2.length;
		int col1=Matrix1[0].length;
		int col2=Matrix2[0].length;
		if(row1 != col1) {
			return;
		}
		else {
			for(int i=0;i<mr1;i++) {
				for(int j=0;j<mc2;j++) {
					for(int k=0;k<mr1;k++) {
						Result[i][j]=Result[i][j]+Matrix1[i][k] * Matrix2[k][j];
					}
					
				}
			}
		}
		System.out.println("The resultant Matrix is");
		for(int i=0;i<mr1;i++) {
			for(int j=0;j<mc2;j++) {
				
				System.out.print(Result[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class MultiplicationOfTwoMatrix { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter row and column size for matrix 1");
		int mr1=scan.nextInt();
		int mc1=scan.nextInt();
		System.out.println("enter row and column size for matrix 2");
		int mr2=scan.nextInt();
		int mc2=scan.nextInt();
		int Matrix1[][] = new int[mr1][mc1];
		int Matrix2[][]=new int[mr2][mc2];
		int Result[][]=new int[mr1][mc2];
		System.out.println("enter the elements of matrix 1");
		for(int i=0;i<mr1;i++) {
			for(int j=0;j<mc1;j++) {
				Matrix1[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the elements of matrix 2");
		for(int i=0;i<mr2;i++) {
			for(int j=0;j<mc2;j++) {
				Matrix2[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		System.out.println("elements of Matrix 1 are");
		for(int i=0;i<mr1;i++) {
			for(int j=0;j<mc1;j++) {
				System.out.print(Matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("elements of Matrix 2 are");
		for(int i=0;i<mr2;i++) {
			for(int j=0;j<mc2;j++) {
				System.out.print(Matrix2[i][j]+" ");
			}
			System.out.println();
		}
		Multiplication.multiply(Matrix1, Matrix2, Result,mr1,mc2);
	}
	
}
