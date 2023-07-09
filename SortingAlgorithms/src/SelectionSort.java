//selection sort select the first element
//store it in min
//store its position
//compare with the next element if the next element is smaller store it in the min and its position in pos
//after the inner loop swap the arr[i] with arr[pos];
public class SelectionSort {
	void sortingMethod(int arr[]) {
		int min;
		int pos;
		for (int i = 0; i <= arr.length - 2; i++) {
			min = arr[i];
			pos = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			int help = arr[i];
			arr[i] = arr[pos];
			arr[pos] = help;

		}
	}
}
