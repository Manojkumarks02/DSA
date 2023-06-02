package Algorithm;

public class LinearSearch1 {

	static int linearSearch(int a[], int n, int val) {

		for (int i = 0; i < n; i++) {
			if (a[i] == val) {
				return i + 1;

			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int a[] = { 10, 22, 33, 55, 34, 86, 90, 12, 23, 90 }; // given array
		int val = 86; // value to be search
		int n = a.length; // size of array
		int res = linearSearch(a, n, val);
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println(" " + a[i]);
			System.out.println();
		}
		if (res == 1) {
			System.out.println("Element is not present ");
		} else {
			System.out.println("element is present : " + res + " position");
		}

	}

}
