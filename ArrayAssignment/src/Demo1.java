
public class Demo1 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		for (int i = 0; i < arr.length; i = i + 2) {// one method
			System.out.println(arr[i]);
		}
		/*
		 * for(int i=0;i<=arr.length-1;i++){//another method if(arr[i]%2==0) {
		 * System.out.println(arr[i]+" "); }
		 */
		// to print odd values
		/*
		 * for(int i=0;i<=arr.length-1;i++){//another method if(arr[i]%2!=0) {
		 * System.out.println(arr[i]+" "); }
		 */
	}

}
