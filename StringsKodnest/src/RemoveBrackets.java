import java.util.*;

class RemoveBracket {
	public String removeBrackets(String str) {
//keep in mind code should be written inside square brackets[]
		String result = str.replaceAll("[(){}]", "");
		return result;
	}
}

public class RemoveBrackets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String value with brackets");
		String str = scan.nextLine();
		RemoveBracket obj = new RemoveBracket();
		System.out.println(obj.removeBrackets(str));
		scan.close();

	}

}
