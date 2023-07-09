import java.util.Scanner;

class Queue {
	private int q[];
	private int size;
	int rear = -1;
	int front = 0;
	private Scanner scan = new Scanner(System.in);

	public Queue(int n) {
		q = new int[n];
		size = q.length;
	}

	public void insert() {
		// corner case if front is at max index
		if (front == size - 1) {
			System.out.println("insertion is not possible");
		} else {
			System.out.println("enter the element to insert");
			int element = scan.nextInt();
			++rear;
			q[rear] = element;
		}

	}

	// method to delete an element
	public void delete() {
		// corner case if rear is not started and front greater than rear
		if (rear == -1 && front > rear) {
			System.out.println("Deletion is not possible");
		} else {
			System.out.println("deleted element is \n" + q[front]);
			++front;
		}
	}

	// method to display
	public void display() {
		// corner case
		if (rear == -1 && front > rear) {
			System.out.println(" No elements inside queue");
		} else {
			for (int i = front; i < rear; i++) {
				System.out.print(q[i] + " ");
			}
			System.out.println();
		}
	}
}

public class QueueAndApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the queue");
		int n = scan.nextInt();
		Queue obj = new Queue(n);
		while (true) {
			System.out.println("enter 1 to insert");
			System.out.println("enter 2 to delete");
			System.out.println("enter 3 to display");
			System.out.println("enter any number to exit");
			System.out.println("enter the choice");
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
