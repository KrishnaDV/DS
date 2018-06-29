package code;

public class StringReverse {

	public static void main(String[] args) {

		String s = "nanna";

		// String res = strRev(s);

		// System.out.println(res);

		System.out.println(revUsingSb(s));

	}

	// private static String strRev(String s) {
	//
	// int len= s.length();
	//
	// char a[] = s.toCharArray();
	//
	// for(int i=0;i<len/2;i++){
	//
	// char tmp = a[i];
	//
	// a[i] = a[(len-1)-i];
	//
	// a[(len-1)-i] = tmp;
	//
	// }
	//
	//
	// return String.valueOf(a);
	//
	// }

	// Using String Buffer

	public static String revUsingSb(String str) {

		if (str == null || str.isEmpty()) {

			return null;
		}

		int len = str.length();

		StringBuffer sb = new StringBuffer(len);

		for (int i = len - 1; i >= 0; i--) {

			sb.append(str.charAt(i));

		}

		return sb.toString();

	}

}
