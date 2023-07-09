import java.util.*;

public class ReverseOfNumber {
	public int method(int num) {
		int rev = 0;//written outside of the while loop because rev is catching outside of while loop
		while (num != 0) {
			
			int digit=num%10;
			rev = rev * 10 + digit;
			num /= 10;// num=num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		ReverseOfNumber obj = new ReverseOfNumber();
		int rev = obj.method(num);
		System.out.println(rev);

	}

}
