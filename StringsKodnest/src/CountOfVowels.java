import java.util.Scanner;

class Vowels {
	public int countVowels(String name) {
		int count = 0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}
		}
		return count;
	}
	//another method optimised
	public static int countVowels2(String name) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='e'||name.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
}

public class CountOfVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string valueF");
		String name = scan.nextLine();
		Vowels obj = new Vowels();
		int result = obj.countVowels(name);
		System.out.println(result);
		System.out.println(  Vowels.countVowels2(name));
		scan.close();
	}

}
