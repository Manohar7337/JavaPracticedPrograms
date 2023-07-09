import java.util.Scanner;

class RemoveSpace {
	public static String removeSpaces(String str) {
		//replace those spaces with null
		return str.replaceAll(" ", "");
	}
	//without using inbuilt functions
	public static String removeSpaces2(String str) {
		String str2="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
			str2=str2+str.charAt(i);
			}
		}
		return str2;
	}
	//the disadvantage of above 2 methods is that it will not remove
	//tab spaces(3 spaces)
	//to remove tab spaces use replaceAll("\\t","");
//to remove all singlespaces and tab spaces replaceAll("\\s","");
	public static String efficientMethod(String str) {
		str=str.replaceAll("\\s", "");
		return str;
		
	}
}

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String value with spaces");
		String str = scan.nextLine();
		System.out.println(RemoveSpace.removeSpaces(str));
		System.out.println(RemoveSpace.removeSpaces2(str));
		System.out.println(RemoveSpace.efficientMethod(str));

	}

}
