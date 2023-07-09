import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int[] arr = new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println("enter the key value");
		int key = scan.nextInt();
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {// as long as
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				System.out.println("key found at index " + mid);
				return;// System.exit(0);
			} else if (key > arr[mid]) {
				low = mid + 1;
				//high = high;
			} else {
				high = mid - 1;
				//low = low;
			}
		}
		System.out.println("key not found");// this line executes if low value
		// exceeds high after checking it inside the while loop
	}
}
