public class isPalindrome {

	public static void main(String[] args) {

		String inp = "nanan";

		boolean res = ispalindrome(inp);

		System.out.println(res);
	}

	private static boolean ispalindrome(String inp) {

		char[] b = inp.toCharArray();

		int i = 0;

		int j = inp.length() - 1;

		while (i < j && b[i] == b[j]) {

			i++;

			j--;
		}

		if (i < j) {
			return false;
		} else {
			return true;
		}
	}
}
