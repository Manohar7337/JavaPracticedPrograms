
public class Question6 {

	public static void main(String[] args) {
		String s1 = " Hi Hello how ";
		int count = 1;
		// char[] ch = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				count++;

			}
		}
		if (s1.endsWith(" ")) {
			count--;
		}
		if (s1.startsWith(" ")) {
			count--;
		}
		System.out.println("No of words are: " + count);
	}

}
