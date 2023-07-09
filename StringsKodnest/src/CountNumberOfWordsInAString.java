import java.util.Scanner;

class CountWords {
	public static int countWords(String str) {
		// split method will return array of strings
		//str=str.trim();//it will remove leading and trailing spaced(cornercase)
		String[] arr = str.split(" ");
		/*
		 * if we don't pass space inside the split method it
		 * will split every character. 
		 */
		return arr.length;// its an array not a string;
	}
	public static int countWords2(String str) {
		int count=1;
		str=str.trim();//it will remove leading and trailing spaced(cornercase)
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
}

public class CountNumberOfWordsInAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String");
		String str = scan.nextLine();
		System.out.println(CountWords.countWords(str));
		System.out.println(CountWords.countWords2(str));

	}

}
