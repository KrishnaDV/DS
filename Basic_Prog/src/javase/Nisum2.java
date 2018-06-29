package javase;

import java.util.HashMap;
import java.util.Map;

public class Nisum2 {

	public static void main(String[] args) {

		/*
		 * Example "aab" -> True "carerac" -> True "abab" -> true "code" ->
		 * False "ababcd" -> true
		 * 
		 * "codode" -> False
		 * 
		 * "aab" -> True "abab" -> true
		 * 
		 * "civic" "abba" "xyx"
		 */

		boolean res = isPalin("code");

		System.out.println(res);
	}

	private static boolean isPalin(String args) {

		int len = args.length();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < args.length(); i++) {

			if (!map.containsKey(args.charAt(i))) {
				map.put(args.charAt(i),1);
			} else {
				map.put(args.charAt(i), map.get(args.charAt(i)) + 1);
			}
		}
		System.out.println(map);

		int count = 0;

		for (char key : map.keySet()) {

			count += map.get(key) % 2;

		}
		return count <= 1;
	}

}
