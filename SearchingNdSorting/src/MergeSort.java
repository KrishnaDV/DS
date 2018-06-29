public class MergeSort {

	public static void main(String[] args) {

		int a[] = { 12, 3, 1, 45, 63, 1, 14 };

		int l = 0;

		int r = a.length - 1;

		mergeSort(a, l, r);

		for (int e : a) {

			System.out.print(e + " ");
		}

	}

	private static void mergeSort(int[] a, int l, int r) {

		int m = (l + r) / 2;

		if(l < r) {

			//sort first nd second halves
			mergeSort(a, l, m);

			mergeSort(a, m + 1, r);

			//merge both halves
			merge(a, l, m, r);

		}

	}

	private static void merge(int[] a, int l, int m, int r) {

		int n1 = m - l + 1;

		int n2 = r - m;

		int l1[] = new int[n1];

		int r1[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			
			l1[i] = a[l + i];

		}

		for (int j = 0; j < n2; j++) {

			r1[j] = a[m + 1 + j];

		}

		int i = 0, j = 0;

		int k = l;

		while (i < n1 && j < n2) {

			if (l1[i] <= r1[j]) {

				a[k] = l1[i];

				i++;

			}

			else {

				a[k] = r1[j];

				j++;

			}
			k++;

		}

		while (i < n1) {

			a[k] = l1[i];

			i++;

			k++;

		}

		while (j < n2) {

			a[k] = r1[j];

			j++;

			k++;

		}
	}

}
