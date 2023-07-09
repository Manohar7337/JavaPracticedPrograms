import java.util.Scanner;

public class SwapwithoutThird {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=scan.nextInt();
		System.out.println("enter value of b:");
		int b=scan.nextInt();
		System.out.println(" value of a and b are a= "+a+"b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping the values are a= "+a +"and b= "+b);
		
	}

}
