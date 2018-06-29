public class SelectionSort {

	public static void main(String[] args) {

		int a[] = { 64, 25, 12, 22, 11 };

		selSort(a);

	}

	private static void selSort(int[] a) {

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			int min = i;

			for (int j = i + 1; j < n; j++) {

				if (a[j] < a[min]) {

					min = j;

				}

			}

			if (min != i) {
				int tmp = a[min];

				a[min] = a[i];

				a[i] = tmp;

			}
		}

		for (int b : a) {

			System.out.print(b + " ");

		}

	}

}
