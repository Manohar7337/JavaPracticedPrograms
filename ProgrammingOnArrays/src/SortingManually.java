
public class SortingManually {

	public static void main(String[] args) {
		int arr[]= {3,4,5,2,7,8};
		int help=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {//j=i+1 prints descending order
				if(arr[i]<arr[j]) {
					help=arr[i];
					arr[i]=arr[j];
					arr[j]=help;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
