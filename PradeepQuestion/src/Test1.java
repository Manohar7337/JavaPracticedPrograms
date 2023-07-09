
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {

		String arr[] = { "Apradeeep5", "jspiders", "Bangalore" };
		method(arr);
	}

	static void method(String[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			String str = arr[i];
			int count[] = new int[200];
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				count[c]++;// 0
			}

			int big = 0;
			int temp = 0;
			for (int k = 0; k < count.length; k++) 
			{

				if (count[k]>big) {
					big = count[k];
					temp = k;

				}

			}
			System.out.println((char) temp);

		}

	}
}