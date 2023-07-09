import java.util.Scanner;
//in coding tests we can return array like below syntax
//return new int[]{secondLargest, secondSmallest};
class SecondLargest {
	int largest = Integer.MIN_VALUE;// array may also have negative integers
	int secondLargest = Integer.MIN_VALUE;

	public int secondLargestMethod(int[] arr, int n) {
		if (arr.length < 2) {// corner case
			return 0;// only one element is present
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;// previous max to first max
				largest = arr[i];// current max to max
			}
			// arr[i] might be less than large but may be greater than second max
			else if (arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
}

class SecondSmallest {
	int smallest = Integer.MAX_VALUE;
	int secondSmallest = Integer.MAX_VALUE;

	public int secondSmallestMethod(int[] arr, int n) {
		if (n < 2) {
			return 0;
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];

			} else if (arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
		
	}
}

public class SecondLargestAndSecondMinimum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements of an array");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		SecondLargest sl = new SecondLargest();
		System.out.println(sl.secondLargestMethod(arr, n));
		SecondSmallest ss=new SecondSmallest();
		System.out.println(ss.secondSmallestMethod(arr, n));

	}

}
