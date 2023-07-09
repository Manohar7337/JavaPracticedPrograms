
public class Question7 {

	public static void main(String[] args) {
		String s1 = "Hi Hello How are you";
		int count = 0;
		// char[] ch = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("No of spaces are: " + count);

	}

}
