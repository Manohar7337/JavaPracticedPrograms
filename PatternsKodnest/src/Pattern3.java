
public class Pattern3 {
	public static void main(String[] args) {
		
	
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			System.out.print("*");
		}
		for(int k=i;k<5;k++) {//k=5;k>=i;k--
			System.out.print("$");
		}
		System.out.println();
	}
}
}
