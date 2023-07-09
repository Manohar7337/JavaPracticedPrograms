import java.util.Scanner;

class CheckString {
	static void checkchars(String str) {
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				//no need to do anything let it check all characters
			} else {
				System.out.println("No some other characters are present");
				System.exit(0);
			}
		}
		System.out.println("all are integers");
	}
}

public class CheckIfStringContainsOnlyCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string ");
		String str = scan.nextLine();
		CheckString.checkchars(str);
		
	}

}
