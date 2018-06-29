import java.util.Arrays;

public class MaxCount {

	public static void main(String[] args) {

		int a[] = {2,2,3,4,5,6,7,7,7,7};

		Arrays.sort(a);

		int count = 0, ele = 0, maxcount = 0, i = 0;

		for (i = 0; i < a.length - 1; i++) {

			if (a[i] == a[i + 1]) {

				count++;

				if (count > maxcount) {

					maxcount = count;

					ele = a[i];
				}

			}

			else {

				count = 0;

			}

		}

		/*
		 * if (count > maxcount) {
		 * 
		 * maxcount = count;
		 * 
		 * ele = a[i]; }
		 */

		System.out.println(ele);

	}

}
