import java.util.Scanner;

public class FindingFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int arr[] = new int[scan.nextInt()];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		boolean visited[] = new boolean[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println();
		}
	}

}
