import java.util.Scanner;

public class FactorsOfGivenNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		FactorsOfGivenNumber obj = new FactorsOfGivenNumber();
		obj.factors(num);

	}

}
