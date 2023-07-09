import java.util.Scanner;

public class RemoveCharactersExceptAlphabets {
	String str2="";
 public  String removeChars(String str) {
// lets store only alphabets automatically others characters will be removed
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)>='a'&& str.charAt(i)<='z' || str.charAt(i)>='A'&& str.charAt(i)<='Z') {
			 str2=str2+str.charAt(i);
		 }
	 }
	 return str2;
 }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		RemoveCharactersExceptAlphabets obj=new RemoveCharactersExceptAlphabets();
		System.out.println(obj.removeChars(str));
		scan.close();
		
	}

}
