import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=scan.nextInt();
		System.out.println("enter value of b:");
		int b=scan.nextInt();
		System.out.println(" value of a and b are a= "+a+"b= "+b);
		/*int c=b;
		b=a;
		a=c;*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping the values are");
		System.out.println("a= "+a);
		System.out.println("b="+b);
		

	}

}
