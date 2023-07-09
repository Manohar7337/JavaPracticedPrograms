
public class DecresingFTriangle {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int a=65;//a=70
			a+=5;
			for(int j=i;j<=5;j++) {
				System.out.print((char)a+" ");
				a++;
			}
			System.out.println();
		}

	}

}
