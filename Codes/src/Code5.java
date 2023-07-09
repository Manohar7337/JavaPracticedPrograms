import java.util.Scanner;
public class Code5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a double value");
		double value=scan.nextDouble();
		System.out.println("Double value="+value);
		System.out.println("Typecasted to float: Value="+(float)value);
		System.out.println("Typecasted to long: Value="+(long)value);
		System.out.println("Typecasted to int: Value="+(int)value);
		System.out.println("Typecasted to short: Value="+(short)value);
		System.out.println("Typecasted to byte: Value="+(byte)value);
	}
}
