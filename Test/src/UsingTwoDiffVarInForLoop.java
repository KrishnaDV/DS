import java.util.Scanner;

public class UsingTwoDiffVarInForLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		int sum1 = 0, sum2 = 0, diff = 0;

		for (int i = 0, j = 0; i < n && j < n; i++, j++) {

			sum1 += a[i][j];

		}

		for (int a_i = 0, a_j = n - 1; a_i < n && a_j >= 0; a_i++, a_j--) {

			sum2 += a[a_i][a_j];

		}

		diff = Math.abs(sum1 - sum2);

		System.out.println(diff);

	}
}
