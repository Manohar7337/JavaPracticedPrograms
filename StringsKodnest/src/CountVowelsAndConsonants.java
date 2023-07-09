import java.util.Scanner;

class CountBoth {
	static void countboth(String str) {
		int vowels = 0;
		int consonants = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' ) {
			vowels++;
		} else {
			consonants++;
		}
	}
		System.out.println("no of vowels are:" +vowels);
		System.out.println("no of consonents:" +consonants);
	}
}

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String str = scan.nextLine();
		CountBoth.countboth(str);

	}

}
