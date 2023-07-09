import java.util.Scanner;

public class MultipleOfIndex3And5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		} // to display
		System.out.println("the multiples of 3 and 5 index array are");
		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(i + " ");

		}

	}
}
