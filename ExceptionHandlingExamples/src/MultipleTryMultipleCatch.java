
import java.util.Scanner;

public class MultipleTryMultipleCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Connection Established");
			System.out.println("Enter 2 numbers for division");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: / by 0");
		} catch (Exception e) {
			System.out.println("Some problem occured");
		}

		try {
			System.out.println("Enter Array Length");
			int arr[] = new int[scan.nextInt()];
			System.out.println("Enter an Integer Element to insert into array");
			int elem = scan.nextInt();
			System.out.println("Enter Index Position to insert the element");
			int pos = scan.nextInt();
			arr[pos] = elem;
			System.out.println("Element present at position " + pos + " is " + arr[pos]);
		} catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");

		} catch (Exception e) {
			System.out.println("Some problem occured");
		}

		System.out.println("Connection terminated");
	}
}