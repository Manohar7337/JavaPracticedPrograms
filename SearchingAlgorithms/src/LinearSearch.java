import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("enter the key value");
		int key = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println("key found at index " + i);
				System.exit(0);//stops execution of the total program
			}
		}
		System.out.println("key not found");
	}

}
