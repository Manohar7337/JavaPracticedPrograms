
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="om";
		String s2="kar";
		String s3="om"+"kar";
		String s4="om"+"kar";
		if(s3==s4) {
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
	}

}
