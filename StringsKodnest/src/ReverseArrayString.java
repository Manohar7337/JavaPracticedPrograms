import java.util.Scanner;

public class ReverseArrayString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name of the string");
		String str = scan.nextLine();
		String arr[] = str.split(" ");
		String revsentence = "";
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String revword = " ";
			// reversin the word
			for (int j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);
			}
			revsentence = revsentence + revword + " ";
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(revsentence);
	}

}
