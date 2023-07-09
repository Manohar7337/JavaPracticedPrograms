import java.util.Scanner;

class CountSumNumbers {
	public int count(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				// ascii value of 0 is 48
				// substract the char value of 0 or int 48 everytime
				sum = sum + str.charAt(i) - '0';
				//sum = sum + str.charAt(i) - 48;
			}
		}
//Q: What if input is having 10 as number?
//Ans:String is a sequence of characters. 
//that means single single characters.
//10 will be treated as two seperate characters 1 and 0

		return sum;
	}
}

public class CountSumOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string value with number");
		String str = scan.nextLine();
		CountSumNumbers obj = new CountSumNumbers();
		int result = obj.count(str);
		System.out.println("sum of String is: " + result);
		scan.close();
	}

}
