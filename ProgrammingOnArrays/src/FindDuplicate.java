
public class FindDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 4, 3, 4, 5, 2, 7, 3 };

		int duplicate;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) 
				{
					duplicate = arr[i];
					System.out.println("duplicate elements are:" + duplicate);
				}
			}
		}
	}
}
