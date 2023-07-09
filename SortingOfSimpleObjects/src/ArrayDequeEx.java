
//we can sort the simple objects by using 2 ways
//1. using TreeSet class (it gives output in sortedSequence)
//2. using Collections.sort() method
//Note we can't use Collections.sort() on ArrayDeque
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayDequeEx {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(100);
		ad.add(27);
		ad.add(34);
		ad.add(76);
		ad.add(29);
		// Collections.sort(ad);//Not possible
		// convert it into arrayList and sort and then convert back to arraydeque
		ArrayList<Integer> al = new ArrayList<>(ad);
		// we can also use the below line
		// al.addAll(ad);
		Collections.sort(al);
		ad.clear();// to clear the previous elements
		ad.addAll(al);
		System.out.print(ad + " ");
	}

}
