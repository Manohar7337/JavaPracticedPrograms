
public class MutableStringSizeDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Prahallad is a Batsman");
		System.out.println(sb.capacity());
		sb.append("He lives in chennai");
		System.out.println(sb.capacity());
		System.out.println("+++++++++++++++");
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity()) ;
		sb1.append("Prahallad is a batsman");
		System.out.println(sb1.capacity());
		sb1.append("He lives in chennai");
		System.out.println(sb1.capacity());

	}

}
