
public class InsertionSOrt {

	public static void main(String[] args) {
		
		
		int a[] = {15,4,2,18};
		
		insertSort(a);
		
		for(int d : a){
			
			System.out.print(d+" ");
			
		}
		
		
	}

	private static void insertSort(int[] a) {
		
		for(int i=1;i<a.length;i++){
			
			int j = i - 1;
			
			int key = a[i];
			
			while(j>=0 && a[j] > key){
				
				a[j+1] = a[j];
				
				j-- ;
				
			}
			
			a[j+1] = key;
			
		}
		
		
		
	}
	
	
}
