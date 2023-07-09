import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			String str=scan.next();
			int num=scan.nextInt();
			//left justified so use -
			//integer should be 3 digits
			//if its having less than 3 it should start with 0
			System.out.printf("%15s%03d",str,num);
			
		}
		

	}

}
