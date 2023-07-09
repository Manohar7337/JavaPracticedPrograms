import java.util.Scanner;

class LinkedList {
	class Node {
		int data;
		Node link;// link==next
	}

	private Scanner scan = new Scanner(System.in);
	private Node first;// first==head

	// method to insert at rear end i.e insert last
	public void insertRear() {
		Node temp;
		Node newNode = new Node();
		System.out.println("enter element to store");
		int element = scan.nextInt();
		newNode.data = element;
		newNode.link = null;
		// corner case1: if List is empty
		if (first == null) {
			first = newNode;
		}
		// corner case2: if List has one or more than one nodes
		else {
			// traverse until last node
			temp = first;
			while (temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;// newNode is is already initialized above
		}
	}

	public void deleteRear() {
		Node temp;
		// we have to delete node so just delete dont create new one
		// corner case1: if list is empty
		if (first == null) {
			System.out.println("List is empty");
		}
		// corner case2: if list has only one node
		if (first.link == null) {
			System.out.println("deleted element is " + first.data);
			first = null;
			// after making it null garbage collector will collect the empty node
			// because it has no link
		}
		// corner case3: if list has many nodes
		else {
			temp = first;
			while (temp.link.link != null) {
				temp = temp.link;
			}
			System.out.println("deleted element is" + temp.link.data);
			temp.link = null;
		}

	}

	// method to insert at front i.e first
	public void insertFront() {
		// Note: to insert in the front no need to traverse.
		// step1:create a newNode to insert
		Node newNode = new Node();
		System.out.println("enter the element");
		int element = scan.nextInt();
		newNode.data = element;// initialising values
		newNode.link = null;
		// check for corner case
		// corner case1: if list is empty
		if (first == null) {
			first = newNode;
		}
		// corner case2: if list has one or more nodes
		else {
			newNode.link = first;// address of first storing in newNode.link
			// link is created now
			first = newNode;// make newNode as first

		}

	}

	// method to delete first
	public void deleteFirst() {
		// Note:to delete no need to create a newNode
// no need to traverse through the list to delete because its first 
		// corner case1:if list is empty
		if (first == null) {
			System.out.println("List is empty");
		}
		// cornercase2: if its having only one node
		else if (first.link == null) {
			System.out.println("deleted element is " + first.data);
			first = null;
		} else {
			System.out.println("deleted element is " + first.data);
			first = first.link;// first.link having value of second node becomes first
		}
	}

	// method to display
	public void display() {
		Node temp;
		// corner case1:
		if (first == null) {
			System.out.println(" list is empty ");
		}
		// corner case 2:
		else if (first.link == null) {
			System.out.println(first.data);
		}

		else {
			// we need to traverse out of the loop
			temp = first;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.link;

			}
			System.out.println();
		}
	}
}

public class LinkedListAndApp {

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();// when we create object memory would be allocated
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("enter 1 to insert at rear end");
			System.out.println("enter 2 to insert at front end");
			System.out.println("enter 3 to delete at rear end");
			System.out.println("enter 4 to delete at front end");
			System.out.println("enter 5 to display");
			System.out.println("enter any key to exit");
			System.out.println("enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				obj.insertRear();
				break;
			case 2:
				obj.insertFront();
				break;
			case 3:
				obj.deleteRear();
				break;
			case 4:
				obj.deleteFirst();
				break;
			case 5:
				obj.display();
				break;
			default:
				return;
			}
		}
	}

}
