import java.util.Scanner;

public class Type1LinearSearch {
	public void linearSearch() {
		System.out.println("enter the length of the array");
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("enter key");
		int key = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("key found at index: " + i);
				return;
			}
		}
		System.out.println("Key not found");
	}

	public static void main(String args[]) {
		Type1LinearSearch obj = new Type1LinearSearch();
		obj.linearSearch();
	}
}
