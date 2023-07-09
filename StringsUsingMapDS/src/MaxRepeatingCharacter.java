import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaxRepeatingCharacter {

	public static void main(String[] args) {
		String x="Manohar";
		//Scanner scan = new Scanner(System.in);
		//System.out.println("enter a string value");
		//String x = scan.nextLine();
		char[] y = x.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		// code to insert data into the map
		int i = 0;
		while (i!=y.length) 
		{
			if (map.containsKey(y[i])==false) {
				map.put(y[i], 1);
			} 
			else {	
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
				
			}
			++i;
		}
		System.out.println(map);
		
		Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
		char maxkey = ' ';
		int maxval = 0;
		for (Map.Entry<Character, Integer> data : lhmap) {
			if (data.getValue() > maxval) {
				maxval = data.getValue();
				maxkey = data.getKey();
			}
		}
		System.out.println("maximum occured character is " + maxkey);
		System.out.println("maximum occured character's value is " + maxval);
		
	}

}
