
public class Question5 {

	public static void main(String[] args) {
		String s1 = "Manohar";
		String s2 = "";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 1) {
				s2 = s2 + ch[i];
			}
		}
		System.out.println("New String is :" + s2);
	}

}
