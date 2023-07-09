import java.util.Scanner;

public class ArraysApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=scan.nextInt();
		Arrays obj=new Arrays(n);
		while(true) {
			System.out.println("press 1 for ---> for inserting");
			System.out.println("press 2 for ---> for deleting");
			System.out.println("press 3 for ---> for displaying");
			System.out.println("press any other number for exiting");
			System.out.println("enter your choice");
			int choice=scan.nextInt();
			switch(choice){
				case 1: obj.insert();
				break;
				case 2: obj.delete();
				break;
				case 3: obj.display();
				break;
				default:
					return;
			}
			
		}
		
	}
	
	
}
