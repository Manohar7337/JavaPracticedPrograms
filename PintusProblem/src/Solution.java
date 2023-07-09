
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter start number");
		int start = scan.nextInt();
		System.out.println("enter end number");
		int end = scan.nextInt();
		System.out.println("enter the number to check");
		int number = scan.nextInt();
		PrimeOrNot obj = new PrimeOrNot();
		System.out.println("Prime numbers between given range are:");
		for (int i = start; i <= end; i++) {
			boolean res = obj.isPrime(i);
			if (res == true) {

				count++;
			}
		}
		// storing the contents into the array
		int arr[] = new int[count];
		int j = 0;
		for (int i = start; i < end; i++) {
			boolean res = obj.isPrime(i);
			if (res == true) {
				arr[j++] = i;
			}
		}
		// printing the contents
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int k = 1; k < arr.length; k++) {
				if (arr[i] + arr[k] == number) {
					System.out.println("yes it is sum " + arr[i] + "+" + arr[k] + "=" + number);
					return;
				}
			}
		}
		System.out.println("No its not the sum of prime numbers");
		System.out.println("Total no of primes:" + count);
		scan.close();
	}

}