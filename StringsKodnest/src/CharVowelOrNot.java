import java.util.Scanner;

class VowelOrNot{
	//if interviewer gives input of random cases
	//convert into upper or lower case
	public static boolean isVowel(char s) {
		if(s=='a'|| s=='e'||s=='i'||s=='o'||s=='u') {
			return true;
		}else 
			return false;
	}
	
}
public class CharVowelOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		boolean result=VowelOrNot.isVowel(ch);
		if(result==true) {
			System.out.println("it is vowel");
		}
		else {
			System.out.println("it is consonant");
		}
	}

}
