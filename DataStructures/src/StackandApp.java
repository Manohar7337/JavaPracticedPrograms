import java.util.Scanner;

class Stack {
	private int s[];
	private int size;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);

	public Stack(int n) {
		s = new int[n];
		size = s.length;
	}

	// method for inserting an element
	public void push() {
		// corner case === if top is at max index
		if (top == size - 1) {// top ==s.length-1;
			System.out.println("push is not possible");
		} else {
			System.out.println("enter an element to push");
			int element = scan.nextInt();
			++top;
			s[top] = element;

		}
	}

	// method to pop or delete an element
	public void pop() {
		// corner case====if stact is empty
		if (top == -1) {
			System.out.println("pop is not possible");
		} else {
			System.out.println("the deleted element is \n" + s[top]);
			--top;
		}
	}

	// method to display
	public void display() {
		// corner case === if stack is empty
		if (top == -1) {
			System.out.println("Display is not possible");

		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(s[i] + " ");
			}
		}
	}
}

public class StackandApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the stack");
		int n = scan.nextInt();
		Stack obj = new Stack(n);// constructor is giving input in above class
		while (true) {
			System.out.println("Press 1 to push");
			System.out.println("Press 2 to pop");
			System.out.println("Press 3 to display");
			System.out.println("Press any number to exit");
			System.out.println("enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				obj.push();
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.display();
				break;
			default:
				return;
			}
		}
	}

}
