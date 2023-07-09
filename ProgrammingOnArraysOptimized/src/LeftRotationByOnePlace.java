import java.util.Scanner;
/*
 * Store the first element of the array in a temporary variable.
Shift all the elements of the array one position to the left.
Place the temporary variable at the last position of the array
 */
class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        return arr;
    }
}
public class LeftRotationByOnePlace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result[]=Solution.rotateArray(arr, n);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
