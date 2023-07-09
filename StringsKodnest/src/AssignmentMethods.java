
public class AssignmentMethods {

	public static void main(String[] args) {
		String s1 = "Hi Hello";
		String s2 = "Hey Hello";
		String s3 = "Hi Hello";
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.endsWith("o"));
		System.out.println(s2.endsWith("a"));
		System.out.println(s3.lastIndexOf('e'));
		System.out.println(s3.lastIndexOf('H'));
		System.out.println(s2.length());
		System.out.println(s1.length());
		String s4 = "Manohar1a";
		String s5 = "Mahesh";
		String s6 = "Namratha";

		System.out.println(s4.replace('a', '2'));
		System.out.println(s4.replaceFirst(s5, s6));
		System.out.println(s5);
		System.out.println(s6.split(s6));
		System.out.println(s1.startsWith("H"));
		System.out.println(s5.replaceAll(s5, s6));

	}

}
