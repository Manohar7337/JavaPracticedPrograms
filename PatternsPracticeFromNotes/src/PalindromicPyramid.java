
public class PalindromicPyramid {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			// print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// first half numbers (vertically divided)
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			// second half numbers
			for (int j = 2; j <= i; j++) {// first row i=1 so not possible
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
