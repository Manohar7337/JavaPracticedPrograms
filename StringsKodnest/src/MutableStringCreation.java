
public class MutableStringCreation {

	public static void main(String[] args) {
		// Using String builder class
		StringBuilder sb1 = new StringBuilder("Raja Ram");
		System.out.println(sb1);
		sb1.append(" Mohan Roy");
		System.out.println(sb1);
		// Using String Buffer class
		StringBuffer sb2 = new StringBuffer("Kodnest");
		System.out.println(sb2);
		sb2.append(" Technologies");
		System.out.println(sb2);

	}

}
