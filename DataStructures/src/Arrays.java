import java.util.Scanner;

public class Arrays {
	private int arr[];
	private Scanner scan = new Scanner(System.in);

	public Arrays(int n) {
		arr = new int[n];
	}

	public void insert() {
		System.out.println("enter the position 0 to " + (arr.length - 1));
		int pos = scan.nextInt();
		System.out.println("enter the element you want to store");
		int element = scan.nextInt();
		arr[pos] = element;
	}

	public void delete() {
		System.out.println("enter the position to delete the element");
		int pos = scan.nextInt();
		arr[pos] = 0;
		System.out.println("the deleted element is" + arr[pos]);
	}

	public void display() {
		System.out.println("the elements present inside array are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}


