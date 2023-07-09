//Java Program to find the frequency of odd & even numbers in the given matrix
public class FrequencyOfOddandEvenInMatrix {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int rows=arr.length;
		int columns=arr[0].length;
		int even=0;
		int odd=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(arr[i][j]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		System.out.println("Even frequency is "+even);
		System.out.println("odd frequency is "+odd);
	}

}
