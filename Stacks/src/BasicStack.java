import java.util.Stack;

public class BasicStack {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();

		st.push(14);

		st.push(2);

		st.push(18);

		st.push(4);

		System.out.println(st);

		int res = getMin(st);

		System.out.println(res);

	}

	private static int getMin(Stack<Integer> st) {

		int min = Integer.MAX_VALUE;

		if (st.isEmpty()) {

			return 0;
		}

		else {
			while (!st.isEmpty()) {

				int curr = st.pop();

				if (curr <= min) {

					min = curr;

				}
			}
			return min;
		}
	}
	// return min;

}
