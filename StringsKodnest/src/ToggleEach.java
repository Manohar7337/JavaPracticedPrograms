
// Java program to toggle each character in a string
// togglin means if we have a uppercase convert it into lower case
// if we have lower case convert it into uppercase
import java.util.Scanner;

class Toggle {
	String name2 = "";

	public String toggle(String name) {

		for (int i = 0; i < name.length(); i++) {
			// here we are checking character by character
			// the characters satisfying if condition toggles in below line
			if (Character.isUpperCase(name.charAt(i))) {//isUpperCase() is used to check whether it is capital or not
				name2 = name2 + Character.toLowerCase(name.charAt(i));//toUpperCase will convert from lower to Upper
			} else {
				// the characters which doesn't satisfy the if condition toggles here
				name2 = name2 + Character.toUpperCase(name.charAt(i));
			}
		}
		return name2;
	}
}

public class ToggleEach {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string variable");
		String name = scan.nextLine();
		Toggle obj = new Toggle();
		String result = obj.toggle(name);
		System.out.println(result);
		scan.close();
	}

}
