import java.util.LinkedList;

public class MethodsInLinkedList {

	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();
		//addition methods
		ll1.add(10);
		ll1.add(20);
		ll1.add(2,30);
		ll1.add(0,40);
		ll1.addFirst(2);
		ll1.addFirst(1);
		ll1.addLast(100);
		ll1.push(110);
		
		//adds element in the starting index
		System.out.println(ll1);
		LinkedList ll2=new LinkedList();
		ll2.add(200);
		ll2.addAll(ll1);//adds(append) list in the end
		System.out.println(ll2);
		//creating a linkedlist by initialising previous link
		LinkedList ll3=new LinkedList(ll1);//will append list in the front
		ll3.add(300);
		System.out.println(ll3);
		System.out.println("==============================");
		//deletion methods
		LinkedList ll4=new LinkedList();
		ll4.add(10);
		ll4.add(20);
		ll4.add(2,30);
		ll4.add(0,40);
		ll4.addFirst(2);
		ll4.addFirst(1);
		ll4.addLast(100);
		System.out.println(ll4);
		ll4.poll();
		System.out.println(ll4);
		ll4.pop();// only delete will not return the deleted element
		System.out.println(ll4);
		ll4.pollLast();
		System.out.println(ll4);
		//remove() delets and retrives(returning deleted element)
		System.out.println(ll4.remove());
		System.out.println(ll4.remove(1));
		System.out.println(ll4);
		ll4.add(10);
		ll4.add(20);
		ll4.add(2,30);
		ll4.add(0,40);
		System.out.println(ll4);
		System.out.println(ll4.removeFirst());
		System.out.println(ll4.removeLast());
		ll4.add(10);
		ll4.add(20);
		ll4.add(2,30);
		ll4.add(0,40);
		//peek() returns first element without deleting
		System.out.println(ll1.peek());
		System.out.println(ll1);
		System.out.println(ll1.peekLast());
		System.out.println(ll1.peekFirst());
		ll1.offer(11);//will add at tail
		ll1.offer(111);
		System.out.println(ll1);
		//only common elements are retained others all are deleted
		ll1.retainAll(ll4);
		System.out.println(ll1);
	
		
		
	}

}
