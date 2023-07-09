import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {// even
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
		System.out.println("==========================");
		int arr[] = new int[count];
		int j = 0;
		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0) {
				// arr[0],arr[1],....
				arr[j++] = i;

			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
