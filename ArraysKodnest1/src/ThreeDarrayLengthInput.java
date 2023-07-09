
// creating 3d array by taking length as input from the user
import java.util.Scanner;

public class ThreeDarrayLengthInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1D and 2D and 3D length to create three Dimension array");
		int arr[][][] = new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.println("enter the value to store in array at index arr[" + i + "][" + j + "][" + k + "]");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}

		System.out.println("Array Contents Are...");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}