import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String x = scan.nextLine();
		char y[] = x.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		// code to insert the data into the map
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
		System.out.println(map);
		Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : lhmap) {
			if (data.getValue() > 1) {
				System.out.println("duplicate key insinde string: " + data.getKey());
				System.out.println("duplicate keys value is " + data.getValue());

			}
		}

	}

}
