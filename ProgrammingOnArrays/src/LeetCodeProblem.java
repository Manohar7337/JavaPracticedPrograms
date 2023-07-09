import java.util.Scanner;

public class LeetCodeProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter target of array");
		int target = scan.nextInt();
		System.out.println("enter size of array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.print(i + ", " + j);
					continue;
				}
			}

		}
		scan.close();
	}
}
