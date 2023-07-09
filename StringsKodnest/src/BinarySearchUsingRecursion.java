
public class BinarySearchUsingRecursion {

	public int binarySearch4(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {// as long as
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				System.out.println("key found at index " + mid);
				return mid;//System.exit(0);
			} else if (key > arr[mid]) {
				low = mid + 1;
				high = high;
				
			} else {
				high = mid - 1;
				low = low;
			}
		}
		System.out.println("key not found");
		return -1;
	}
}
