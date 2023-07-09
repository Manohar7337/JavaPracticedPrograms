import java.util.Scanner;

public class DeletingAParticularElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter element to be deleted");
		int elem=scan.nextInt();
		int location=0;
		int flag=1;
		//finding the element to be deleted
		for(int i=0;i<n;i++) {
			if(arr[i]==elem) {
				flag=1;
				location=i;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
		for(int i=location+1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
		}
		else {
			System.out.println("no element found");
		}
	}
//if you don't want to do this procedure store the elements 
	//in another array except one element which should be deleted
}
