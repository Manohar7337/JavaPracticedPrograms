
//java program to reverse a string
import java.util.Scanner;

class ReverseStr {
	// method 1 to reverse String
	public static String reverse(String original) {
		String reverse = "";
		for (int i = 0; i < original.length(); i++) {
			reverse = original.charAt(i) + reverse;
		}
		return reverse;
	}

	// method 2 to reverse String
	static String reverse2(String original) {
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		return reverse;
	}
	//method 3 to reverse String
	static StringBuilder reverse3(String original) {
		StringBuilder sb=new StringBuilder();
		sb.append(original);
		 sb.reverse();
		 return sb;
		
	}
}

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String name = scan.nextLine();
		// printing and calling a method directly without collecting
		System.out.println(ReverseStr.reverse(name));
		System.out.println(ReverseStr.reverse2(name));
		System.out.println(ReverseStr.reverse3(name));
		scan.close();
	}

}
