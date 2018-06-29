
public class KMPSearchWIP {

	public static void main(String[] args) {
		
		String inp = "aaabaaa";
		
		String pat = "aa";
		
		patMatch(inp,pat);
		
		
	}

	private static void patMatch(String inp, String pat) {
		
		int n = inp.length();
		
		int m = pat.length();
		
		int lps[] = new int[m];
		
		prefixTable(pat,m, lps);
		
		
		
	}

	private static void prefixTable(String pat, int m, int lps[]) {
		
		lps[0] = 0;
		int i = 1, len =0;
		
		while(i<m){
			
			if(pat.charAt(i) == pat.charAt(len)){
				
				lps[i] = len+1;
				len++;
				i++;
			}
			else if(len > 0){
				
				len = lps[len-1];
				
			}
			else{
			
				lps[i] = 0;
				i++;
			}
		}
		
		
	}
	
}
