import java.util.Scanner;

class SwapClass{
	public static void  withThird(String str1,String str2,String temp) {
		//we don't swap strings we swap references
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println("str1= "+str1+"\n "+"str2= "+str2);
	}
	public static void withoutThird(String str1,String str2) {
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println("str1= "+str1+"\n"+"str2= "+str2);
	}
}
public class SwapTwoStrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		String temp="";
		SwapClass.withThird(str1, str2, temp);
		SwapClass.withoutThird(str1, str2);
	}

}
