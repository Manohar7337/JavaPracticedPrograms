import java.util.Scanner;

public class SumOfNumbersInaGivenRange {
	int sumOfNumbers(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum;//when i call method that will return this.
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start =scan.nextInt();
		int end=scan.nextInt();
		SumOfNumbersInaGivenRange obj = new SumOfNumbersInaGivenRange();
		int sum1 = obj.sumOfNumbers(start, end);// collection is most important
		System.out.println(sum1);
		scan.close();
	}

}
