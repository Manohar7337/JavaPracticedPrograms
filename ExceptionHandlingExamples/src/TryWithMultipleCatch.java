
import java.util.Scanner;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		try {
			System.out.println("Connection Established");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 2 numbers for division");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a / b;
			System.out.println(c);
			System.out.println("Enter Array Length");
			int arr[] = new int[scan.nextInt()];
			System.out.println("Enter an Integer Element to insert into array");
			int elem = scan.nextInt();
			System.out.println("Enter Index Position to insert the element");
			int pos = scan.nextInt();
			arr[pos] = elem;
			System.out.println("Element present at position " + pos + " is " + arr[pos]);
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException : / by 0");
		} catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException : enter positive array size");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException : Be in your array limites");
		} catch (Exception e) {
			System.out.println(
					"Some Other Problem Occured...Technical issue...your resouces Are safe...try again if problem persists call our customer care or visit us at our nearest center");
		}
		System.out.println("Connection terminated");
	}
}
