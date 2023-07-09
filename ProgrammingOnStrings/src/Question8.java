
public class Question8 {

	public static void main(String[] args) {
		String s1 = "ManohAr";
		int count = 0;
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				count++;
			}
		}
		System.out.println("No of upper cases are: " + count);
	}

}
