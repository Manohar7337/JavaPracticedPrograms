import java.util.concurrent.*;
import java.util.Iterator;

public class Solution {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cwal = new CopyOnWriteArrayList<>();
		for (int i = 0; i < 5; i++) {
			cwal.add(i);
		}
		Iterator<Integer> itr = cwal.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			cwal.add(99);// it will not print if you dont call it
		}
		System.out.print("\n"+cwal + " ");
	}

}
