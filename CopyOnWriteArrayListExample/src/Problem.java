import java.util.ArrayList;
import java.util.Iterator;

public class Problem {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			al.add(i);
		}
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
			al.add(99);
		}
	}
	//it will result in concurrentModificationException
	//to solve this problem use CopyOnWriteArraylist class in
	//instead of Arraylist.

}
