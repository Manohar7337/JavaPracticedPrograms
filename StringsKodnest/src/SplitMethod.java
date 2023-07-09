
public class SplitMethod {

	public static void main(String[] args) {
		String str = "Kodnest Technologies pvt limited";
		String arr[] = str.split("e");
		// For each loop or enhanced for loop
		for (String s : arr) {
			System.out.println(s);
		}
		// normal for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
