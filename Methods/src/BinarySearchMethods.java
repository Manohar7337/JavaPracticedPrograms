import java.util.Scanner;

public class BinarySearchMethods {

	void binarySearch1() {
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
				return;//System.exit(0);// 
			} else if (key > arr[mid]) {
				low = mid + 1;
				high = high;
			} else {
				high = mid - 1;
				low = low;
			}
		}
		System.out.println("key not found");
	}

	void binarySearch2(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {// as long as
			int mid = (low + high) / 2;
			if (key == arr[mid]) {
				System.out.println("key found at index " + mid);
				return ;//System.exit(0);// 
			} else if (key > arr[mid]) {
				low = mid + 1;
				high = high;
			} else {
				high = mid - 1;
				low = low;
			}
		}
		System.out.println("key not found");
	}

	public int binarySearch3() {
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
				return mid;// System.exit(0);//
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

	public static void main(String[] args) {
		BinarySearchMethods obj1 = new BinarySearchMethods();
		obj1.binarySearch1();
		System.out.println("===========================");
		
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
		obj1.binarySearch2(arr, key);
		System.out.println("==========================");
		int ans=obj1.binarySearch3();
		
		System.out.println("=======================");
		
		obj1.binarySearch4(arr, key);
		
		//
		
	}

}
