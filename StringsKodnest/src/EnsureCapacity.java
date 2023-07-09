
public class EnsureCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(70);
		System.out.println(sb.capacity());
		StringBuilder sb1 = new StringBuilder(70);
		System.out.println(sb1.capacity());
		StringBuilder sb2 = new StringBuilder();
		sb2.ensureCapacity(80);
		System.out.println(sb2.capacity());

	}

}
