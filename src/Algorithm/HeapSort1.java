package Algorithm;

public class HeapSort1 {

	// function to heapify a subtree
	static void heapify(int a[], int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && a[left] > a[largest]) {
			largest = left;
		}

		if (right < n && a[right] > a[largest]) {
			largest = right;
			if (largest != i) {

				int temp = a[i];
				a[i] = a[largest];
				a[largest] = temp;
				heapify(a, n, largest);
			}
		}

	}

	// Function to implement the heap sort
	static void heapSort(int a[], int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(a, n, i);
		}

		for (int i = n - 1; i >= 0; i--) {

			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			heapify(a, i, 0);
		}
	}

	static void printArr(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.println(a[i] + " ");
	}

	// function to print the array elements
	public static void main(String[] args) {
		int a[] = { 4, 5, 2, 7, 9, 1 };
		int n = a.length;
		System.out.println("before sorting");
		printArr(a, n);
		heapSort(a, n);
		System.out.println("after sorting");
		printArr(a, n);
	}

}
