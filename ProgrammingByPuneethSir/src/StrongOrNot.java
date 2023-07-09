/* A number is Strong if sum of all the digits in a given number 
is equal to the same number*/
public class StrongOrNot {
	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	boolean detectStrong(int num) {
		int temp = num;
		int digit = 0;
		int sum = 0;
		while (temp != 0) {
			digit = temp % 10;
			sum = sum + factorial(digit);
			temp = temp / 10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}

}
