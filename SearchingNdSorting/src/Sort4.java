import java.util.Arrays;

//Find the missing number
public class Sort4 {

	public static void main(String[] args) {
		
		int a[] = {8,6,4,2,1,3,7};
		
		missingNum(a);
		
	}

	private static void missingNum(int[] a) {
		
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length-1; i++) {
			
			if(a[i]+1!=a[i+1]){
				
				System.out.println(a[i]+1);
				
				
			}
			
		}
		
		
	}
	
}
