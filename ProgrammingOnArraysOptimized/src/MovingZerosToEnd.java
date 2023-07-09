import java.util.Scanner;

class MZE {
	public static int[] moveZeros(int n, int[] arr) {
		int j = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;// giving its position to j
				break;
			}

		}
		if (j == -1) {
			return arr;
		}
		// starting the iteration from j+1
		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;

	}
}

public class MovingZerosToEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements of an array");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int arr2[] = MZE.moveZeros(n, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		scan.close();

	}

}
