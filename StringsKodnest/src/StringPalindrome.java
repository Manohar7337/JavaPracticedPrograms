import java.util.Scanner;

class Stringg {
	// method 1 to check palindrome
	static boolean isPalindrome(String str) {
		String temp = str;
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			str2 = str.charAt(i) + str2;
		}
		// if(temp==str2) it will compare references not strings
		if (temp.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}
//method 2 by prepinsta
	static String isPalindrome2(String name) {
		String reverse = "";
		for (int i = name.length()-1; i >= 0; i--) {
			reverse = name.charAt(i) + reverse;
		}
		if (reverse.equals(name)) {
			return "It is palindrome";
		} else {
			return "It is not palindrome";
		}
	}

}

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string 2 times");
		String str = scan.nextLine();
		String name = scan.nextLine();
		boolean result = Stringg.isPalindrome(str);
		if (result == true) {
			System.out.println("entered string is palindrome");
		} else
			System.out.println("entered String is not palindrome");
		scan.close();
		String result2 = Stringg.isPalindrome2(name);
		System.out.println(result2);
	}

}
