import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Java programs to delete the duplicates in a String
public class RemoveDuplicatesUsingMaps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string value");
		String x = scan.nextLine();
		char[] y = x.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();
//code to insert data into the map
		int i = 0;
		while (i != y.length) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);

			} else {
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			++i;
		}
		String str = "";
		Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : lhmap) {
			// keys in map are unique so if we print the keys duplicates wont print
			// we can print the data directly inside the map
			// or store the data in an empty link
			System.out.println(data.getKey());
		}
	}

}
