
import java.util.Scanner;

abstract class ArrayInputOneD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the array to create 1D integer array");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter array elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter an element to store in array index " + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("Array Contents Are...");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
