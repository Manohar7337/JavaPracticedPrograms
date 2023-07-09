import java.util.Scanner;
public class Code4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the event");
		String event=scan.nextLine();
		System.out.println("Enter the type of the event");
		String type=scan.nextLine();
		System.out.println("Enter the number of people expected");
		int people=scan.nextInt();
		System.out.println("Is it a paid entry?(Type Y or N)");
		char yesorNo=scan.next().charAt(0);
		System.out.println("Enter the projected expenses (in lakhs) for this event");
		double expenses=scan.nextDouble();
		System.out.println("Event Name:"+event);
		System.out.println("Event Type:"+type);
		System.out.println("Expected Count:"+people);
		System.out.println("Paid Entry:"+yesorNo);
		System.out.println("Projected Expense:"+expenses+"L");
	}
}
