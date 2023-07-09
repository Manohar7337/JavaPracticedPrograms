import java.util.Scanner;

public class EvenNumbersAndOddNumbersSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("entered array elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int even = 0;
		int odd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];

			}
		}
		System.out.println("Sum of even elements are " + even);
		System.out.println("Sum of odd elements are " + odd);
	}

}
