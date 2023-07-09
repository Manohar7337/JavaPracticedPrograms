import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row size");
		int rows = scan.nextInt();
		System.out.println("enter the column size");
		int columns = scan.nextInt();
		int arr[][] = new int[rows][columns];
		int arr2[][] = new int[rows][columns];
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
				arr2[j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
