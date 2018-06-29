
public class LinearSearch {

	public static void main(String[] args) {
		
		
		int a[] = {1,32,42,3,231,23};
		
		boolean res = linSearch(a,23);
		
		System.out.println(res);
		
	}

	private static boolean linSearch(int[] a, int j) {
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==j){
				
				return true;
				
			}
			
		}
		
		
		return false;
	}
	
	
	
}
