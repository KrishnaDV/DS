package javase;

import java.util.HashMap;
import java.util.Map;

//Find first and last occurence of repititive character in Array.

public class Nisum1 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int x = 5;

		int[] res = find(arr, x);

		for (int i : res) {
			System.out.println(i);
		}
	}

	static public int[] find(int[] nums, int x) {

		int[] res = new int[2];

		int first = -1;

		int last = -1;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == x) {

				if (!map.containsKey(x)) {

					first = i;
					map.put(x, 1);
				} else {

					last = i;
				}

			}
		}

		res[0] = first;

		res[1] = last;

		return res;

	}
}
