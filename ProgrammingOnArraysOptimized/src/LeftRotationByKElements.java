class Solution1{
	//we have to write two methods here
	public static void reverse(int arr[],int start,int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	/*same method in for loop
	 * public void reverse(int arr[], int start, int end) {
    for (int i = start, j = end; i < j; i++, j--) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

	 */
	public static void leftRotate(int arr[],int n,int d) {
		if(n==0) return;
		d=d%n;
		//step1
		reverse(arr,0,d-1);
		//step2:
		reverse(arr,d-1,n-1);
		//step3:
		reverse(arr,0,n-1);
	}
}
public class LeftRotationByKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        System.out.println("Before rotation:");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");
        System.out.println();

       Solution1.leftRotate(arr, n, d);
        System.out.println("After rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
	}

}
