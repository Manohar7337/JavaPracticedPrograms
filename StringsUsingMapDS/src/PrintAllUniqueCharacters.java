//java program  to print all non repeating character
import java.util.*;

public class PrintAllUniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String value");
		String x = scan.nextLine();

		char[] y = x.toCharArray();
		int size = y.length;

		Map<Character, Integer> map = new HashMap<>();
		// HashMap results the output in randome order
		// LinkedHashMap resuts the output in the same sequence as of input
		// TreeMap results the output in the sorted sequence
		int i = 0;
		while (i != size) {
			// if(map.containtKey(y[i]) !=0) //gives exception in program //null pointer
			// exception
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {
//if its value is one then its unique
			if (data.getValue() == 1) {
				System.out.println(data.getKey());
			}
		}
		scan.close();
	}

}
