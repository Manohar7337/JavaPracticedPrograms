import java.util.Scanner;

public class Type2LinearSearch {
	public void linearSearch(int arr[],int key) {
		//code for linear search
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("key found at index: " + i);
				return;
			}
		}
		System.out.println("Key not found");
	}
public static void main(String args[]) {
	System.out.println("enter the length of the array");
	Scanner scan = new Scanner(System.in);
	int arr[] = new int[scan.nextInt()];

	System.out.println("Enter the elements of an array");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scan.nextInt();
	}
	System.out.println("enter key");
	int key = scan.nextInt();
	Type2LinearSearch obj=new Type2LinearSearch();
	obj.linearSearch(arr,key);
}
}



