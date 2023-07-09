import java.util.Scanner;

class CircularQueue {
	private Scanner scan = new Scanner(System.in);
	private int cq[];
	private int size;
	private int count;
	private int front = 0;
	private int rear = -1;

	public CircularQueue(int n) {
		cq = new int[n];
		size = cq.length;
	}

	// method to insert
	public void insert() {
		// corner case if cq is full i.e count is size-1
		if (count == size) {
			System.out.println("insertion is not possible");
		} else {
			System.out.println("enter the element");
			int element = scan.nextInt();
			rear = (rear + 1) % size;
			cq[rear] = element;
			count++;
		}
	}

	// method to delete
	public void delete() {
		// corner cases when cq is empty i.e. count is zero
		if (count == 0) {
			System.out.println("deleting is not possible");

		} else {
			System.out.println("the deleted element is \n" + cq[front]);
			// point front to next element
			front = (front + 1) % size;
			count--;
		}
	}
	// method to display

	public void display() {
		int front1 = front;
		// corner case if cq is empty i.e count ==0
		if (count == 0) {
			System.out.println("display is not possible");
		} else {
			for (int i = 1; i <= count; i++) {
				System.out.println(cq[front1] + " ");
				front1 = (front1 + 1) % size;
			}
		}
	}

}

public class CircularQueueAndApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the Queue");
		int n = scan.nextInt();
		CircularQueue obj = new CircularQueue(n);
		while (true) {
			System.out.println("enter 1 for insertion");
			System.out.println("enter 2 for deletion");
			System.out.println("enter 3 for display");
			System.out.println("enter any number to exit");
			System.out.println("enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				obj.insert();
				break;
			case 2:
				obj.delete();
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
