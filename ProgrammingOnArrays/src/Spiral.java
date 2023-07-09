import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row size");
		int rows = scan.nextInt();
		System.out.println("enter the column size");
		int columns = scan.nextInt();
		int arr[][] = new int[rows][columns];

		// int lowersum = 0;
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int top = 0, down = arr.length - 1;
		int left = 0, right = arr.length - 1;
		int dir = 0;
		while (top <= down && left <= right) {

			if (dir == 0) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + " ");
				}
				top++;

			} else if (dir == 1) {
				for (int i = top; i <= down; i++) {
					System.out.print(arr[i][right] + " ");
				}

				right--;

			} else if (dir == 2) {
				for (int i = right; i >= 0; i--) {
					System.out.print(arr[down][i] + " ");
				}
				down--;

			} else if (dir == 3) {
				for (int i = down; i >= 0; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;

			}

			dir = (dir + 1) % arr.length;
		}
		scan.close();

	}

}
