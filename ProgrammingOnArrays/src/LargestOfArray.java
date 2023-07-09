import java.util.Scanner;

class Largest {
	public int largestElement(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}

public class LargestOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("entered array elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		Largest l=new Largest();
	System.out.println("\nlargest element is: "+l.largestElement(arr));	
		}

}
