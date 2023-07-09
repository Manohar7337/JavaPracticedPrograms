
//java program to check a string has all the unique characters
import java.util.*;

public class CheckStringHasAllUniqueCharacters {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.println("enter a string value");
		String x = scan.nextLine();
		scan.close();*/
		String x="Manohar";
//converting string into character array 
		char[] y = x.toCharArray();
		int size = y.length;
//creating a empty map ds..HashMap in this example
		Map<Character, Integer> map = new HashMap<>();
//code to initialise the HashMap ...i.e fill the hashMap
		int i = 0;
		while (i != size) {
			// checking the condition if map doesn't contain key
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				// if map is already having that key
				int oldVal = map.get(y[i]);
				int newVal = oldVal + 1;
				map.put(y[i], newVal);
			}
			++i;
		}
		
//code to access the data inside the map
//or code to check if it has unique characters
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {
			if (data.getValue() > 1) {
				System.out.println("Doesn't contain all unique characters");
				System.exit(0);
			}
			System.out.println("contains all unique characters");
		}
	}

}
