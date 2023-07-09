import java.util.Scanner;

public class OuterElementsSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row size");
		int rows = scan.nextInt();
		System.out.println("enter the column size");
		int columns = scan.nextInt();
		int arr[][] = new int[rows][columns];
		int sum = 0;
		// int lowersum = 0;
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == 1 && j == 1) {
					continue;
				} else {          // if(i!=1&&j!=1)use this directly without upper condition
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
