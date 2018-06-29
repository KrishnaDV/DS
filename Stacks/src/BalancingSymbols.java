import java.util.Stack;

public class BalancingSymbols {

	public static void main(String[] args) {

		String inp = "{(a+b)+c}";

		System.out.println(checkBal(inp));
	}

	private static boolean checkBal(String inp) {

		Stack<Character> st = new Stack<Character>();

		if (inp.length() == 0 || inp == null) {

			return true;

		} else {
			for (int i = 0; i < inp.length(); i++) {

				if (inp.charAt(i) == ')') {

					if (!st.isEmpty() && st.peek() == '(') {

						st.pop();

					} else
						return false;
				}

				else if (inp.charAt(i) == ']') {

					if (!st.isEmpty() && st.peek() == '[') {

						st.pop();

					} else
						return false;
				} else if (inp.charAt(i) == '}') {

					if (!st.isEmpty() && st.peek() == '{') {

						st.pop();

					} else
						return false;
				}

				else if (inp.charAt(i) == '(' || inp.charAt(i) == '['
						|| inp.charAt(i) == '{') {

					st.push(inp.charAt(i));

				}

			}

			if (st.isEmpty()) {
				return true;
			} else
				return false;

		}

	}

}
