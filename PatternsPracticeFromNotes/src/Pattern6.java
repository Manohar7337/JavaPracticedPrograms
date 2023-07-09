/*
 * j loop will be iterating from 1 to 5 
 * print value of j that will print 12345 in one row
 * it repeats for 5 rows
 */
public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1 ;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
