
public class SumOfEachRowAndColumnInMatrix {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int rows=arr.length;
		int columns=arr[0].length;
		int rowsum=0;
		int colsum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				rowsum=rowsum+arr[i][j];
				colsum=colsum+arr[j][i];
			}
			System.out.println("sum of "+i+" row is "+rowsum);
			System.out.println(" sum of "+i+" column is "+colsum);
			rowsum=0;
			colsum=0;
		}
	}
	//if you want to print all rows sum one by one then use 
	//two seperate iterations for both rows and columns
	//in the above code we have used only one time

}
