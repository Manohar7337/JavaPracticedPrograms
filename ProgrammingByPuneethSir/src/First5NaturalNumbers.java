import java.util.Scanner;

public class First5NaturalNumbers {
	void numbers(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("sum is " + sum);
	}

	public static void main(String[] args) {
		First5NaturalNumbers obj = new First5NaturalNumbers();
		obj.numbers(5);

	}

}
