import java.util.Scanner;
class UpperTriangle{
	public static void upperTriagle(int[][] arr,int rows,int columns) {
		if(rows!=columns)
			System.out.println("Matrix should be square");
		else {
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					if(i>j) {
						System.out.print("0 ");//space after 0
					}
					else {
						System.out.print(arr[i][j]+" ");
					}
					
				}
				System.out.println();
				
			}
		}
	}
}
public class UpperTriangularMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter rows");
		int rows=scan.nextInt();
		System.out.println("enter columns");
		int columns=scan.nextInt();
		int arr[][]=new int[rows][columns];
		System.out.println("enter the array elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=scan.nextInt();
			}
			
			
		}
		UpperTriangle.upperTriagle(arr, rows, columns);
	}

}
