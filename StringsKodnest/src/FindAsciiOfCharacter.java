import java.util.Scanner;
class AsciiValue{
	public int asciiOf(char ch) {
		return ch;//1st time	
	}
	public int ascii2(char ch) {
		//assign the char value to the int variable
		int value=ch;
		return ch;
	}
}
public class FindAsciiOfCharacter {

	public static void main(String[] args) {
		AsciiValue obj=new AsciiValue();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scan.next().charAt(0);
		int result=obj.asciiOf(ch);
		int result2=obj.asciiOf(ch);
		System.out.println(result);
		System.out.println(result2);
		scan.close();

	}

}
