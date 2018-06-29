public class SuperReducedString {

	public static void main(String[] args) {

		String inp = "azbbzy";

		String res = superReduce(inp);

		System.out.println(res);

	}

	private static String superReduce(String inp) {

		StringBuffer sb = new StringBuffer(inp);

		for (int i = 0; i < sb.length() - 1; i++) {

			if (sb.charAt(i) == sb.charAt(i + 1)) {
				sb.delete(i, i + 2);
				i = 0;
			}

		}

		return sb.toString();
	}

}
