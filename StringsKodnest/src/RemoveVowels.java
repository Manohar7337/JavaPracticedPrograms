import java.util.Scanner;

class Remove {
	public String removeVowels(String str) {
		// write inside the square brackets
		//replaceAll method will replace with specified values and returns the String
		return str.replaceAll("[aeiouAEIOU]", "");

	}
	//manual method without using inbuit functions
	public String manualMethod(String str) {
		String str2="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				continue;
			}else {
				str2=str2+str.charAt(i);
			}
		}
		return str2;
	}
}

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name of string");
		String name = scan.nextLine();
		Remove obj = new Remove();
		String result = obj.removeVowels(name);
		System.out.println(result);
		System.out.println(obj.manualMethod(name));
		scan.close();
	}

}
