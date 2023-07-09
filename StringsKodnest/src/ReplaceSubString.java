import java.util.Scanner;

class Replace {
	static String replacesubString(String str, String oldString, String newString) {

		String result = str.replace(oldString, newString);
		return result;
	}
}

public class ReplaceSubString {

	public static void main(String[] args) {
		System.out.println("enter the original string");
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		System.out.println("enter the string to be replaced");
		String oldString = scan.nextLine();
		System.out.println("enter the new String");
		String newString = scan.nextLine();
		System.out.println(Replace.replacesubString(str, oldString, newString));
		scan.close();
	}

}
