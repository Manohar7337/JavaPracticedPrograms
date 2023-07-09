import java.util.Scanner;

public class ProductOfAll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		System.out.println("entered array elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("the product of array elements are:" + product);

	}

}
