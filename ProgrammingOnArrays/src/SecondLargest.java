import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements ");
		int n=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				secondmax=max;//previous max to secondmax
				max=arr[i];//current max to max
			
			}
			//arr[i] might be less than max but greater than second max
			else if(arr[i]>secondmax && arr[i]!=max) {
				secondmax=arr[i];
			}
		}
		System.out.println("second max is:"+secondmax);
		System.out.println("max is :"+max);
	}

}
