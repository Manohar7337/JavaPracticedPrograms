import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingInArrayList {

	public static void main(String[] args) {
// if we declare arraylist of Type Object we can use any datatypes
// inside the arraylist. because
//Integer,Float,Boolean,String all wrapper classes are Objects.
//Usually we declare wrapper classes in creation of Lists
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add("Hi");
		al.add("Hello");
		al.add(12.12f);
		al.add(12.345);
		al.add(true);
		al.add(false);
		System.out.println(al);
		System.out.println("===========================");

		// traversing by iterator() method
		System.out.println("traversing by iterator() method");
		Iterator<Object> aliterator = al.iterator();
		while (aliterator.hasNext()) {
			Object store = aliterator.next();
			System.out.print(store + " ");
		}
		System.out.println("\n===========================");
		// traversing in the reverse order by listIterator() method
		System.out.println("traversing in the reverse order by listIterator() method");
		ListIterator<Object> alListIterator = al.listIterator(al.size());
		while (alListIterator.hasPrevious()) {
			Object store1 = alListIterator.previous();
			System.out.print(store1 + " ");
		}
		System.out.println("\n===========================");
		//traversing in ArrayList by using forEach loop
		System.out.println("traversing in ArrayList by using forEach loop");
		for(Object store2:al) {
			System.out.print(store2+" ");
		}
		System.out.println("\n===========================");
		//traversing in ArrayList by using simple for loop
		System.out.println("traversing in ArrayList by using simple for loop");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println("\n=============================");
		//traversing in the reverse order by using simple for loop
				System.out.println("traversing in the reverse order by using simple for loop");
				for(int i=al.size()-1;i>=0;i--) {
					System.out.print(al.get(i)+" ");
				}
	}
}
