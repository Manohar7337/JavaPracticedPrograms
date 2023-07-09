import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
//linked list can have methods of List as well as Queue
public class CreatingAndPrintingLL {

	public static void main(String[] args) {
		//simple linked list
		LinkedList ll1=new LinkedList();
		ll1.add(10);
		ll1.add(20);
		ll1.add("Hi");
		ll1.add(23.23f);
		ll1.add(10);//duplicates allowed
		ll1.add(true);
		
		//printing linkedlist by simple method
		System.out.println(ll1);
		System.out.println("=========================");
		System.out.println("Printing linked list by iterate() method");
		Iterator objit=ll1.iterator();
		while(objit.hasNext()) {
			System.out.print(objit.next()+" ");
		}
		System.out.println("\n=========================");
		
		//generic linked list
		System.out.println("Creating linkedList of generic String type");
		LinkedList<String> ll2=new LinkedList<>();
		ll2.add("KodNest");
		ll2.add("Technology");
		//ll2.add(10);//can not insert int
		ll2.add("java");
		System.out.println("Printing linked list by iterate() method");
		Iterator objit2=ll2.iterator();
		while(objit2.hasNext()) {
			System.out.print(objit2.next()+" ");
		}
		
		System.out.println("\n=========================");
		
		//object type linkedlist
		System.out.println("Creating linkedList of generic Object type");
		LinkedList<Object> ll3=new LinkedList<>();
		ll3.add("KodNest");
		ll3.add("Technology");
		ll3.add(10);
		ll3.add(11.11f);
		ll3.add(false);
		ll3.add(null);
		System.out.println("Printing ll3 by for each method");
		for(Object store:ll3) {
			System.out.print(store+" ");
		}
		
		System.out.println("\n=========================");
		System.out.println("Printing ll3 in reverse order by listIterator()");
		
		//printing ll3 in the reverse order by listIteretor() method
//keep in mind we should intialise size in listIterator()
		ListIterator objLIT =ll3.listIterator(ll3.size());
//while dealing with this keep mind we should use previous method
		while(objLIT.hasPrevious()) {
			System.out.print(objLIT.previous()+" ");
		}
		
		
		//reverse order by using descendingIteretor();
		System.out.println("\n=========================");
		System.out.println("Printing ll3 in reverse order by descengintIterator()");
		Iterator objDIT = ll3.descendingIterator();
		while(objDIT.hasNext()) {
		System.out.print(objDIT.next()+" ");
		}

	}

}
