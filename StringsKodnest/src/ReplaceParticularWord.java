import java.util.Scanner;

class ReplaceWord {
	public static String replaceWord(String str, String oldword, String newword) {
		String result = str.replaceAll(oldword, newword);
		return result;
	}
}

public class ReplaceParticularWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = scan.nextLine();
		System.out.println("enter the word to replace");
		String oldword = scan.nextLine();
		System.out.println("enter the new word");
		String newWord = scan.nextLine();
		String result = ReplaceWord.replaceWord(str, oldword, newWord);
		System.out.println(result);
		scan.close();
	}

}
