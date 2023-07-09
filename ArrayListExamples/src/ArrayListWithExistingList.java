// Creating an ArrayList from another collection using the ArrayList(Collection c) constructor.
// Example of appending the collection to start of another collection
//to append in the end use addAll() method
import java.util.ArrayList;
public class ArrayListWithExistingList {

	public static void main(String[] args) {
		//creating a simple arrayList first
		ArrayList<Integer> al1 =new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
		System.out.println("===============================");
// creating new arraylist collection intialised with previous collection(al1)
// if you want to add the type should be same as previous
		ArrayList<Integer> al2 = new ArrayList<Integer>(al1);
		//al2 collection is already having elements present in al1
		al2.add(60);
		al2.add(70);
		al2.add(80);
		al2.add(90);
		al2.add(100);
		System.out.println(al2);
		System.out.println("=============================");
		System.out.println(al1);
		System.out.println("===============================");
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(110);
		al3.add(120);
		al3.add(140);
//addAll method is used to add the total list at the rear end
		al1.addAll(al3);
		System.out.println(al1);
		System.out.println("===============================");
		
		
	}

}
