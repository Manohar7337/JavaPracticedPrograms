import java.util.Scanner;

public class PerfectNumbersInRangeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting range");
		int start=scan.nextInt();
		System.out.println("enter the ending range");
		int end=scan.nextInt();
		for(int i=start;i<=end;i++) {
			PerfectNumbersInRange.perfect(i);
		}
		scan.close(); 

	}

}
