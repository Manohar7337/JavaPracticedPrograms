import java.util.Scanner;

class Maximum{//code
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
class Minimum{
	public static int minimumElement(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}
public class MaximumAndMinimumElement {

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
		
		Maximum l=new Maximum();
	System.out.println("\nlargest element is: "+l.largestElement(arr));
	System.out.println("smallest element is: "+Minimum.minimumElement(arr));
	}

}
