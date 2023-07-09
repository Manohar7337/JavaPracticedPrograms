import java.util.Scanner;

public class Type4LinearSearch {
	int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]) {

		System.out.println("enter the length of the array");
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("enter key");
		int key = scan.nextInt();
		Type4LinearSearch obj = new Type4LinearSearch();
		int result = obj.linearSearch(arr, key);
		if (result >= 0) {
			System.out.println("Key Found At The Index " + result);
		} else {
			System.out.println("Key Not Found");

		}
	}
}
