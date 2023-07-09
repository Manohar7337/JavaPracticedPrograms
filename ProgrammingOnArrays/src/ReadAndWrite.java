import java.util.Scanner;

public class ReadAndWrite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		} // to display
		System.out.println("the array contents are");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
