import java.util.Scanner;

class RR {
	// method for reversing
	public static void reverse(int arr[], int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}

//method for right rotation rotation
	//this method will return an array collect it in another array
	public static int[] rightRotate(int arr[], int d, int n) {
		d=d%n;//most important
		reverse(arr, n - d, n - 1);// last 3 elements
		reverse(arr, 0, n - d - 1);// first n-d elements
		reverse(arr, 0, n - 1);
		return arr;
	}
}

public class RightRotationByKElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = scan.nextInt();
		System.out.println("enter the value of d to rotate");
		int d = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int arr2[] = RR.rightRotate(arr, d, n);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		scan.close();
	}

}
