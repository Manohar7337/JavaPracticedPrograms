import java.util.Scanner;

class CheckString1{
	public static String check(String str) {
		if(str.length()==0) {
			return "yes its null";
		}
		else 
			return "No its not";
	}
	
	}
public class CheckIfStringIsEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(CheckString1.check(str));
		scan.close();
	}

}
