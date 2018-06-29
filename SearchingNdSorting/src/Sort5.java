import java.util.HashMap;
import java.util.Set;

//Given an array of n num. Find the first ele in the array which is repeated. 
// eg. in {3,2,1,2,2,3} first repeated number is 3 not 2. Return first ele among repeated num.
public class Sort5 {

	public static void main(String[] args) {

		int a[] = { 3, 2, 1, 2, 2, 3 };

		int res = firstRepeat(a);

		System.out.println(res);

	}

	private static int firstRepeat(int[] a) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {

			if (!hm.containsKey(a[i])) {

				hm.put(a[i], i + 1);

			}

			else {

				if (!(hm.get(a[i]) < 0)) {

					hm.put(a[i], -(hm.get(a[i])));
				}
			}

		}
		
		
		Set<Integer> s = hm.keySet();
		
		for(int b : a){
			
			if(hm.get(b)<min){
				
				min = b;
				
			}
			
			
		}

		return min;
	}

}
