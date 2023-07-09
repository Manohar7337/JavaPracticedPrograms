
public interface CalculatorApp {
	void add();
	void sub();
	void mul();
	void div();
}
import java.util.Scanner;

public class SimpleCalculator implements Calculator {
private Scanner scan=new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter 2 numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Simple Addition is "+c);
	}

	@Override
	public void sub() {
		System.out.println("Enter 2 numbers for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a-b;
		System.out.println("Simple subtraction is "+c);
	}

	@Override
	public void mul() {
		System.out.println("Enter 2 numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		System.out.println("Simple Multiplication is "+c);
	}

	@Override
	public void div() {
		System.out.println("Enter 2 numbers for Division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Simple Division is "+c);
		
	}

}
import java.util.Scanner;

public class ScientificCalculator implements Calculator {
	private Scanner scan=new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("Enter 2 numbers for addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0||b==0)
		{
			System.out.println("Go t0 LKG");
		}
		else
		{
		int c=a+b;
		System.out.println("Scientific Addition is "+c);
		}
	}

	@Override
	public void sub() {
		System.out.println("Enter 2 numbers for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0||b==0)
		{
			System.out.println("Go t0 LKG");
		}
		else
		{
		int c=a-b;
		System.out.println("Scientific subtraction is "+c);
		}
	}

	@Override
	public void mul() {
		System.out.println("Enter 2 numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a==0||b==0)
		{
			System.out.println("Go t0 LKG");
		}
		else {
		int c=a*b;
		System.out.println("Scientific Multiplication is "+c);
		}
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers for Division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(b==0)
		{
			System.out.println("Go t0 LKG");
		}
		else
		{
		int c=a/b;
		System.out.println("Scientific Division is "+c);
		}
	}

}
public class Maths {
	public void accept(Calculator ref)
	{
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
	}
}
public class CalculatorApp {

	public static void main(String[] args) {
		Maths math=new Maths();
		math.accept(new SimpleCalculator());
		math.accept(new ScientificCalculator());
	}

}
