import java.util.Scanner;

public class RemoveAllOccuranceOfGivenCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String str = "spiderlies";
		String result = str.replaceAll(s, "");
		System.out.println(result);
	}

}
