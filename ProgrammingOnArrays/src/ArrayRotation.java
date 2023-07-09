import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		// creating temp array
		System.out.println("enter the length of temp array");
		int k = scan.nextInt();
		int temp[] = new int[k];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		int j = 0;
		for (int i = k; i < arr.length; i++) {
			arr[j] = arr[i];
			j++;
		}
		int a = 0;
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[a];
			a++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
