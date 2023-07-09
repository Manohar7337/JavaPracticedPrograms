import java.util.Scanner;

public class StringOneDArrayLengthInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		String arr[] = new String[scan.nextInt()];

		System.out.println("Enter a sting to store in an array ");
		String element = scan.next();

		System.out.println("enter the position in between 0 to " + (arr.length - 1));
		int position = scan.nextInt();

		arr[position] = element;

		System.out.println("Element present at position " + position + " is " + arr[position]);

	}
}