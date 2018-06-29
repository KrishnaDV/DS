package javase;

public class RotArrayByK {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		
		int res[ ] = rotArray(a,2);
		
		
		System.out.println("res");
		
		for(int g : res){
			
			System.out.print(g+" ");
			
		}
		
		
	}

	private static int[] rotArray(int[] a, int i) {

		int c = a.length;
		
		int k = c-i;
		
		 int p = i;
		
		int b[] = new int[c];
		
		for(int j=0;j<k;j++){
			
			
			b[j] = a[i];
		
			i++;
			
		}
		
		
		for(int y=0;y<p;y++){
			
			b[y+k] = a[y];
			
		}
		
		
		return b;
	}
	
}
