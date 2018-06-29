public class QuickSort {

	public static void main(String[] args) {

		int a[] = { 10, 34, 45, 22, 17, 6, 88, 70 };

		int low = 0;

		int high = a.length - 1;

		quickSort(a, low, high);

		for (int e : a) {

			System.out.print(e + " ");

		}

	}

	private static void quickSort(int[] a, int low, int high) {

		if (low < high) {

			int p = partition(a, low, high);

			quickSort(a, low, p - 1);

			quickSort(a, p + 1, high);

		}
	}

	private static int partition(int[] a, int low, int high) {

		int piv = a[high];

		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {

			if (a[j] <= piv) {

				i++;

				int tmp = a[j];
				
				a[j] = a[i];
				
				a[i] = tmp;

			}

		}

		int tmp = a[i + 1];

		a[i+1] = a[high];
		
		a[high] = tmp;
		
		return (i+1);
	}


}
