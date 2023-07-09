import java.util.Scanner;

public class BubbleSortByMethods {
	void bubbleSort1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter Array Contents");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Array Elements Before Sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Array Elements After Sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void bubbleSort2(int arr[]) {
		System.out.println("Array Elements Before Sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Array Elements After Sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	int[] bubbleSort3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter Array Contents");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Array Elements Before Sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	int[] bubbleSort4(int arr[]) {
		System.out.println("Array Elements Before Sorting");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		BubbleSortByMethods sort = new BubbleSortByMethods();
		sort.bubbleSort1();
		System.out.println("==========================================");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[] = new int[scan.nextInt()];

		System.out.println("Enter Array Contents");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		sort.bubbleSort2(arr);

		System.out.println("=======================================");
		int arr1[] = sort.bubbleSort3();
		System.out.println("Array Elements After Sorting");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("===========================================");
		System.out.println("Enter Array length");
		int arr2[] = new int[scan.nextInt()];

		System.out.println("Enter Array Contents");
		for (int i = 0; i <= arr2.length - 1; i++) {
			arr2[i] = scan.nextInt();
		}

		int arr3[] = sort.bubbleSort4(arr2);
		System.out.println("Array Elements After Sorting");
		for (int i = 0; i <= arr3.length - 1; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
