
public class Question3 {

	public static void main(String[] args) {
		String s1 = "Hi How are you";
		String s2 = "";
		s2 = s2 + s1;
		System.out.println(s2);
		System.out.println("=======================");
		char[] ch = s1.toCharArray();
		String s3 = "";
		for (int i = 0; i < ch.length; i++) {
			s3 = s3 + ch[i];
		}
		System.out.println(s3);
	}

}
