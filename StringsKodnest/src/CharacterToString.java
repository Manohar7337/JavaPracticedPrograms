
public class CharacterToString {

	public static void main(String[] args) {
		char c='a';
		//method 1
		String s=Character.toString(c);
		System.out.println(c);
		//method 2
		String s2=String.valueOf(c);
		System.out.println(s2);

	}

}
