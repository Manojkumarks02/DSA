package Algorithm;

public class BubbleSort1 {
	static void print(int a[]) { // function to print array elements
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}

	}

	static void bubbleSort(int a[]) { // function to implements bubble sorting
		int n = a.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
                if(a[j] < a[i])
                {
                	temp =a[i];
                	a[i] = a[j];
                	a[j] = temp;
                	
                }
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {35,10,31,11,26};
		BubbleSort1 b = new BubbleSort1();
		System.out.println("before sorting : ");
	    b.print(a);
	    b.bubbleSort(a);
	    System.out.println("after sorting : ");
	    b.print(a);
		
				
	}

}
