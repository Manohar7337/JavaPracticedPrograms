
public class Demo3 {

	public static void main(String[] args) {
		String s1=new String("Omkar");
		String s2=new String("Omkar");
		if(s1==s2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}

	}

}
