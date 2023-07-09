import java.util.Arrays;
import java.util.Scanner;
//Anagram is a word formed by re arranging the letters of a different words.
class Anagram {
	static boolean isAnagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		// below line compares two arrays and gives boolean to collect
		boolean result = Arrays.equals(ch1, ch2);
		return result;
	}
}

public class AnagramProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two strings");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		boolean result = Anagram.isAnagram(str1, str2);
		if (result == true) {
			System.out.println("Yes it is anagram");
		} else
			System.out.println("No its not an anagram");

		scan.close();
	}

}
