import java.util.ArrayList;
public class GenericArrayList {

	public static void main(String[] args) {
		//creating arraylist of type Integer
		ArrayList<Integer> al1 =new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.remove(3);
		System.out.println(al1);
		System.out.println(al1.contains(30));
		System.out.println(al1.isEmpty());
		System.out.println(al1.indexOf(40));
		System.out.println(al1.get(10));
		//al.add("hi");//can not add other data types except int
		//al.add(12.34f);//can not add other data types
		System.out.println(al1);
		ArrayList<String> al2 =new ArrayList<>();
		al2.add("Manohar");
		al2.add("Manu");
		//al2.add(10);// cannot add int to String type
		//al2.add(true);//can not add boolean to String type
		System.out.println(al2);
	}

}
