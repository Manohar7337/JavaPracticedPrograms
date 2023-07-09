import java.util.Scanner;

public class AbundantOrNotApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		boolean result = AbundantOrNot.isAbundant(num);
		if(result ==true)
			System.out.println(num+" is Abundant");
		else
			System.out.println(num+ "is not Abundant it is Deficient");
	}

}
