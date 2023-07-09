import java.util.Scanner;

public class DisplayOddElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		} // to display
		System.out.println("the odd array elememts are");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] % 2 != 0)
				System.out.print(arr[i] + " ");
		}

	}

}
