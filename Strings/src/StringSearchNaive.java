import java.util.HashMap;
import java.util.Map;

public class StringSearchNaive {

	public static void main(String[] args) {

		String inp = "aaabaaa";

		String pat = "aa";

		patMatch(inp, pat);

	}

	private static void patMatch(String inp, String pat) {
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,pat);
		for(int i=0;i<=(inp.length()-pat.length());i++){
			String key = inp.substring(i,i+pat.length());
			if(key.equals(hm.get(1))){
				System.out.println("Match Found at "+i);
			}
			
		}
		
		
	}

//	private static void patMatch(String inp, String pat) {
//
//		boolean flag = false;
//
//		for (int i = 0; i <= (inp.length() - pat.length()); i++) {
//
//			for (int j = 0; j < pat.length(); j++) {
//
//				if (pat.charAt(j) != inp.charAt(i+j)) {
//					flag = false;
//					break;
//				} else {
//					flag = true;
//				}
//			}
//			if (flag == true) {
//
//				System.out.println("Found Match at " + i);
//			}
//
//		}
//	}

}
