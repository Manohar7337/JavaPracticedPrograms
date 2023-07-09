import java.util.Scanner;

//  *****
//  *****
//  *****
//  *****
//  *****
/*
 * here no of rows are 5 and columns are 5
 * outer loop i will be for handling rows
 * inner loop j will be for handling columns
 * rows starts from 1 and ends at 5 
 * columm also starts from 1 and ens at 5
 */
public class Pattern3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
