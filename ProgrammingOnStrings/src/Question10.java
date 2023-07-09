import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// index of a particular character
		Scanner scan = new Scanner(System.in);
		String s1 = "Manohar";
		System.out.println("enter the character");
		char character = scan.next().charAt(0);
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == character) {
				System.out.println(i);
			}
		}

	}

}
