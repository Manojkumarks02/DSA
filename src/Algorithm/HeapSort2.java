package Algorithm;

import java.util.Arrays;

public class HeapSort2 {
	public static void heapSort(int[] array) {
        int n = array.length;
         
        // Build the heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (maximum value) to the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }
	
	private static void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && array[left] > array[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
	public static void main(String[] args) {
		int array[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Original array: " + Arrays.toString(array));
		heapSort(array);

		System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
