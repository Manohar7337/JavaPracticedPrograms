import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int myAge = scan.nextInt();
		int fatherAge = 0;
		int motherAge = 0;
		fatherAge = myAge * 22 + 15;
		motherAge = myAge * 22 - 15;
		System.out.println(myAge + "-" + fatherAge + "-" + motherAge);
	}

}
