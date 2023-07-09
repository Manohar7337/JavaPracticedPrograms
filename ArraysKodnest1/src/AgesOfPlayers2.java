import java.util.Scanner;

public class AgesOfPlayers2 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		 float arr[][]=new float[8][];
		 arr[0]=new float[2];
		 arr[1]=new float[2];
		 arr[2]=new float[7];
		 arr[3]=new float[3];
		 arr[4]=new float[4];
		 arr[5]=new float[5];
		 arr[6]=new float[3];
		 arr[7]=new float[2];
		 
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("enter heights of game "+i+" player "+j);
				arr[i][j]=sc.nextFloat();	
				}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
				
				}
			System.out.println();
		}
		
		}
}
