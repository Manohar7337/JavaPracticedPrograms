import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to print series upto");
		int n=scan.nextInt();
		Fibanocci obj=new Fibanocci();
		obj.fibanocci(n);
		

	}

}
