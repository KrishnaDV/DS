public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 5, 1, 4, 2, 8 };

		bubbleSort(a);

		for (int c : a) {

			System.out.print(c + " ");

		}

	}

	private static void bubbleSort(int[] a) {

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < (n - i)-1; j++) {

				if (a[j] > a[j + 1]) {

					int tmp = a[j + 1];

					a[j + 1] = a[j];

					a[j] = tmp;

				}

			}

		}

	}

}
