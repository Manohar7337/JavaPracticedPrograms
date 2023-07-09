import java.util.Scanner;

public class DisplayMultipleOf3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		} // to display
		System.out.println("the multiples of 3 index array are");
		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}

	}

}
