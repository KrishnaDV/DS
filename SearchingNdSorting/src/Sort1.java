import java.util.HashMap;
import java.util.Set;

// Find two elements in array whose sum is equal to given value k.
public class Sort1 {

	public static void main(String[] args) {

		int a[] = { 1, 1, 4, 5, 6, 0};

		int k = 1;

		doCal(a, k);

	}

	private static void doCal(int[] a, int k) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			hm.put(a[i],1);

		}

		
		Set<Integer> s = hm.keySet();

		for (int b : s) {

			if (hm.containsKey(k - b)) {

				System.out.println(b + " " + (k - b));

				return;
				
			}

		}

		System.out.println("No element");
		
	}

}
