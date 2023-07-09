//Java program to check a character is an alphabet or not
import java.util.*;
class AlphabetOrNot{
	//type 4 method taking char input and returning string as output
	public String isAlphabet(char ch) {
		if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z') {
			return "Yes it is alphabet";
		}
		/*we can also check the condition by using ascii values
		 * if(ch>=67&& ch<=90|| ch>=97&& ch<=122){
		 */
		else
			return "No it is not alphabet";
	}
}
public class CharAlphabetOrNot {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scan.next().charAt(0);
		AlphabetOrNot obj=new AlphabetOrNot();
		String result=obj.isAlphabet(ch);
		System.out.println(result);
		scan.close();
	}

}
