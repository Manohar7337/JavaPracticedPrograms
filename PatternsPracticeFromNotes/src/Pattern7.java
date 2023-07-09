/*
 * for first row i value will be 1
 * for second row i value will be 2
 * for third row i value will be 3 
 * for fourth row i value will be 4
 * for fifth row i value will be 5
 * so print i values it will print i values in every column
 */
public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1 ;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
