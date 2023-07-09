import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//creating the arrayList
		ArrayList al=new ArrayList();
		//adding the elements into the arrayList
		al.add(10);//int 
		al.add(20);//int 
		al.add("String");//string
		al.add(true);//boolean
		al.add(23.4);//double
		al.add(21.2f);//float
		System.out.println("ArrayList Created and elements are added");
		System.out.println(al);
		System.out.println("========================");
		System.out.println(al.isEmpty());
		al.remove(0);//will remove 0th index
		al.set(0, 30);
		System.out.println(al);
		System.out.println(al.contains(20));
		System.out.println(al.size());
		System.out.println(al.get(2));//accesing the 2nd index element
		System.out.println(al.indexOf("String"));
		al.clear();//clears the list
		System.out.println("Arraylist cleared");
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
	}

}
