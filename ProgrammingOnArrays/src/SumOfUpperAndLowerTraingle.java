import java.util.Scanner;

public class SumOfUpperAndLowerTraingle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row size");
		int rows = scan.nextInt();
		System.out.println("enter the column size");
		int columns = scan.nextInt();
		int arr[][] = new int[rows][columns];
		int uppersum = 0;
		int lowersum = 0;
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i < j) {
					uppersum = uppersum + arr[i][j];
				}
			}
		}
		System.out.println(uppersum);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i > j) {
					lowersum = lowersum + arr[i][j];
				}
			}
		}
		System.out.println(lowersum);

	}

}
