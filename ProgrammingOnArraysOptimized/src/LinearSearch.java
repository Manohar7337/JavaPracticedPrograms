import java.util.Scanner;

//also called as finding the first occurance
class Lsearch {
	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;//return keyword is used to exit method
				//if it is returned methos will be exited.
			}	
		}
		return -1;
	}
}

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the key ");
		int key = scan.nextInt();
		System.out.println("enter the size");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Lsearch.linearSearch(arr, key));
	}

}
