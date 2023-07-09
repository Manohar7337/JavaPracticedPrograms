import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		String arr[] = new String[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		for (int i = 0; i < 3; i++) {
			arr[i] = scan.next();
		}
		for (int i = 0; i < 3; i++) {
				arr[i]="Hyderabad";
			System.out.print(arr[i] + " ");
		}

	}

}
