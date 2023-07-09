import java.util.Scanner;

class Demo {
	private int arr[];
	private Scanner scan = new Scanner(System.in);

	public Demo(int n) {
		arr = new int[n];
	}

// code to insert element
	public void insert() {
		System.out.println("enter the position from 0 to " + (arr.length - 1));
		int pos = scan.nextInt();
		System.out.println("enter the element to insert");
		int element = scan.nextInt();
		arr[pos] = element;
	}

	// code to delete
	public void delete() {
		System.out.println("enter the position to delete");
		int pos = scan.nextInt();
		arr[pos] = 0;
		System.out.println("the element deleted is " + arr[pos]);
	}

	// code to display
	public void displey() {
		System.out.println("the elements of an array are");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}
}

public class DemoApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = scan.nextInt();
		Demo d = new Demo(n);

		while (true) {
			System.out.println("enter 1 to insert element");
			System.out.println("enter 2 to delete element");
			System.out.println("enter 3 to display elements");
			System.out.println("enter any keys to close");
			System.out.println("enter the choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				d.insert();
				break;
			case 2:
				d.delete();
				break;
			case 3:
				d.displey();
				break;
			default:
				return;
			}
		}

	}

}
