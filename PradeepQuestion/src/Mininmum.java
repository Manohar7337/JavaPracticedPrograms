import java.util.Scanner;

public class Mininmum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String str=scan.next();
		int dummy=0;
		char first=str.charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==first) {
				System.out.print(++dummy);
			}else
				System.out.print(str.charAt(i));
		}
	}

}
