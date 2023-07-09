import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,2,5,7};
		int temp[]=new int[arr.length];
		Arrays.sort(arr);
		int j=0;
		arr[1]=temp[1];
		for(int i=1;i<arr.length;i++) {
			
				if(arr[i]!=arr[j]) {
					temp[i]=arr[i];
					j++;
					System.out.print(temp[i]);
				}
	
		}
		
			
		
		
		
	}

}
/*Algoritm:
 * create an array arr[]
 * sort the array in ascending order
 * create a new array with the same length as that of previous array 
 * create a helper variable to point to the index of new array
 * make the first element of temp as that of 1st element of arr
 * create a loop which iterates on arr
 * start the iteration from 1st position of arr
 * upon each iteration check if arr[i] element id not equal to the element in temp[i]
 * if the condition is true assign the arr[i] value to temp[i] 
 *  */
