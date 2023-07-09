import java.util.ArrayList;
import java.util.Scanner;

public class PrimeRangeApp {

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter start number");
		int start = scan.nextInt();
		System.out.println("enter end number");
		int end = scan.nextInt();
		PrimeOrNot obj = new PrimeOrNot();
		System.out.println("Prime numbers between given range are:");

		for (int i = start; i <= end; i++) {
			boolean res = obj.isPrime(i);
			if (res == true) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total no of primes:" + count);
		scan.close();
		//storing the same in the array
		int[] arr=new int[count];
		int j=0;
		for(int i=start;i<=end;i++) {
			boolean res=obj.isPrime(i);
			if(res==true) {
				arr[j]=i;
				j++;
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

		
		

	}

}
