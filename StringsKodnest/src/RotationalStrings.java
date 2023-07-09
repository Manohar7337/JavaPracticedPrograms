import java.util.Arrays;
import java.util.Scanner;
//check 1 is working fine
//check 2 and check3 are not working for some inputss
class Rotationals {
	public static String check1(String original, String keyString) {
		char ch1[] = original.toCharArray();
		char ch2[] = keyString.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		// to convert character to array
		String str1 = new String(ch1);
		String str2 = new String(ch2);
		if (str1.equals(str2)) {
			return "Yes rotational Strings";
		} else {
			return "Not rotational Strings";
		}
	}

	public static String check2(String original, String keyString) {
		if(original.length()!=keyString.length()) {
			return "Not Rotaionsl Strings";
		}
		String str3 = original.concat(keyString);
		if (str3.contains(keyString)) {
			return "Yes rotational Strings";
		} else {
			return "Not rotational Strings";
		}
	}
	public static String check3(String original, String keyString) {
		char ch1[] = original.toCharArray();
		char ch2[] = keyString.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			return "yes rotaional Strings";
		}
		else {
			return "No rotational Strings";
		}
	}
}

public class RotationalStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter original String");
		String original = scan.nextLine();
		System.out.println("enter keyString String");
		String keyString = scan.nextLine();
		System.out.println(Rotationals.check1(original, keyString));
		System.out.println(Rotationals.check2(original, keyString));
		System.out.println(Rotationals.check2(original, keyString));
		scan.close();
	}

}
