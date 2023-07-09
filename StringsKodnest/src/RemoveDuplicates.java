/*
 * Algorithm
 * 1. Convert the given String into character array
 * 2.Create a String builder to store the result
 * 3.Initialise a flag to false
 * 4.check if string contains duplicate
 * 5.If duplicate is present set flag to true
 * 6. Check the condition if flag is false append the particular character to Stringbuilder 
 */
/*Most Important points to remember
 * Q. Why we are using StringBuilder to store?
 * A. Normal String class is immutable. once created can't 
 * be modified. So we will go with StringBuilder we will be 
 * appending every non repeated character to resultant StringBuilder.
 * */
import java.util.Scanner;

class RemoveDup {
	public static void remove(String str) {
		char arr[] = str.toCharArray();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {// flag==false
				result.append(arr[i]);
			}
		}
		System.out.println(result);
	}
}

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String str = scan.next();
		RemoveDup.remove(str);
		scan.close();
	}

}

