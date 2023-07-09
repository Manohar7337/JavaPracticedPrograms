//Java program to Capitalize the First and Last letter of Each Word of a String
/*Algorithm
 * Store firstLetter in a new string
 * store middle letters in a new string
 * store last letter in a new string
 * make firstletter.toUpperccase and lastletter.toUppercase
 * concatenate all three strings and store in a new string*/
import java.util.Scanner;

class Capitalise {
	public static String capitalise(String str) {
//substring(start index,end index);
//starting index is included but end index is excluded
		String firstLetter = str.substring(0, 1);
//substring(start index) because we are taking last index
//no indexes after that
		String lastLetter = str.substring(str.length() - 1);
		String middleWords = str.substring(1, str.length() - 1);
		String Result = firstLetter.toUpperCase() + middleWords + lastLetter.toUpperCase();

		return Result;
	}
}

public class CapitaliseFirstAndLast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string in lower cases");
		String str = scan.nextLine();
		System.out.println(Capitalise.capitalise(str));
		scan.close();

	}

}
