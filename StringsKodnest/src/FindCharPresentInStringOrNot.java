import java.util.Scanner;

public class FindCharPresentInStringOrNot {

	boolean search(String s, char c) {
		/*
		 * char arr[]=s.toCharArray(); 
		  for(int i=0;i<=arr.length-1;i++) {
		   if(arr[i]==c)
		 * { 
		 * return true; 
		 * } 
		 * }
		 *  return false;
		 * 
		 */
		/*
		 * for(int i=0;i<=s.length()-1;i++) {
		 *  if(s.charAt(i)==c) {
		 *   return true;
		 *    }
		 * 
		 * } 
		 * return false;
		 *  }
		 */

		/*
		 * if (s.indexOf(c) >= 0) { 
		 * return true;
		 *  }
		 *  else {
		 *   return false; 
		 *   }
		 */

		if (s.contains(String.valueOf(c)))
			return true;
		else
			return false;

	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string name");
		String s = scan.nextLine();
		System.out.println("enter the character which you want to search");
		char c = scan.next().charAt(0);
		FindCharPresentInStringOrNot obj = new FindCharPresentInStringOrNot();
		boolean res = obj.search(s, c);
		if (res == true) {
			System.out.println("Yes it is present inside the string");
		} else {
			System.out.println("No it is not present.");
		}
	}
}
//Note: It is a case sensitive code take care of uppercase and lower case while searching
