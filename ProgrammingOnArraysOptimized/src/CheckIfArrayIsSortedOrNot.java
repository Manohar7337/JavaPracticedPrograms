import java.util.Scanner;
//logic 
class CheckSorted {
	public static boolean isSorted(int arr[], int n) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1]) {

			} else {
				return false;
			}
		}
		return true;
	}
}

public class CheckIfArrayIsSortedOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		boolean result = CheckSorted.isSorted(arr, n);
		if (result == true) {
			System.out.println("yes sorted");

		} else {
			System.out.println("No not sorted");
		}

	}

}
