import java.util.Scanner;

public class ArmstrongNumbersInRangeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting number");
		int start=scan.nextInt();
		System.out.println("enter the ending number");
		int end=scan.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
		int power=ArmstrongNumbersInRange.getCount(i);
		int res=ArmstrongNumbersInRange.getSum(i, power);
		if(i==res) {
			System.out.println(i + " is Armstrong number");
			count++;
		}
		}
		System.out.println("There are "+ count +
		" ArmstrongNumbers are in the the range of "+start+ " and "+end);
		
	}

}
