
//Java Program to find length of the string without using length function
import java.util.Scanner;

class Length {
	int size = 0;

	public int lengthOfStr(String name) {
		for (char ch : name.toCharArray()) {
			size++;
		}
		return size;
	}
}

public class LengthOfAStrngWithoutStrlen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String name = scan.nextLine();
		Length obj = new Length();
		int value = obj.lengthOfStr(name);
		System.out.println(value);
		scan.close();

	}

}
