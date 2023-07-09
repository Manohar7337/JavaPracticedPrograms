
public class OtherMethods {

	public static void main(String[] args) {
		String s1 = new String("Raja Ram Mohan Roy");
		System.out.println(s1);
		System.out.println("==============");
		System.out.println(s1.toUpperCase());
		System.out.println("===============");
		System.out.println(s1.toLowerCase());
		System.out.println("==============");
		System.out.println(s1.charAt(13));
		System.out.println("=============");
		System.out.println(s1.indexOf('j'));
		System.out.println("==============");
		System.out.println(s1.contains("Ram"));
		System.out.println("============");
		System.out.println(s1.contains("kam"));
		System.out.println("===============");
		System.out.println((s1.substring(11)));
		System.out.println("=====================");
		System.out.println((s1.substring(10, 13)));
		System.out.println("===========================");
		System.out.println(s1.isEmpty());
		String s2 = new String();
		s2 = s2.concat("Ramasita");
		System.out.println(s2);
		System.out.println("==============");
		System.out.println("==============");
		s2 = s2.trim();
		System.out.println(s2);
		System.out.println("============");
		String s3 = new String("Omkar");
		System.out.println(s3);
		System.out.println("============");
		String s4 = s3.intern();
		System.out.println(s4);
		System.out.println("============");
		String s5 = "Omkar";
		if (s4 == s5) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are not equal");
		}
	}

}
