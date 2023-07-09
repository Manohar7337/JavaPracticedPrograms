import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents before sorting are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//for size n >>> n-1 iterations  this is first loop
		//for size 5 >> 4 iterations
		//4 iterations means 0 to 3; i.e 0th 1st 2nd 3rd
		//second loop is for comparisons of every iteration
		//for n elements n-2-i comparisons will take place
		
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=n-2-i;j++) {//as i increases comparisons should decrease
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
			
		}
		System.out.println("After sorting the array contents are");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		//if you want to modify the loops then the condition will 
		//be changed 
		/*
		 * for(int i=0;i<arr.length-1;i++){
		 * for(int j=0;j<n-1-i;j++)

		 */
		

	}

}
