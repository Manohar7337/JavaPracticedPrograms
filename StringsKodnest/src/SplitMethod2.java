
public class SplitMethod2 {

	public static void main(String[] args) {
		String str = "Kodnest ";
		char arr[] = str.toCharArray();

		// For each loop or enhanced for loop
		for (char c : arr) {
			System.out.println(c);
		}
		// normal for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
