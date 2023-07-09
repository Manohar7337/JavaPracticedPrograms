/*
 * Here no of # increases as rows increases that means 1st row 1 # 2 nd row 2 #..like that
 * print 5 stars for each row
 */
public class Pattern14 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
