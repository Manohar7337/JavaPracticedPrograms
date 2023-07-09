
public class ArmstrongNumbersInRange {
	public static int getCount(int number) {// if we use static method no need to Create object to access it
		int count = 0;
		int digit = 0;
		while (number != 0) {
			digit = number % 10;
			count++;
			number /= 10;
		}
		return count;
	}

	public static int getSum(int number, int power) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			int value = (int) Math.pow(digit, power);
			sum = sum + value;
			number = number / 10;
		}
		return sum;

	}
}
