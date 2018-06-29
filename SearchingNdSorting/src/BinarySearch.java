
public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7,8};
		
		int pos = binSearch(a,999);
		
		System.out.println(pos);
		
		
	}

	private static int binSearch(int[] a, int j) {
		
		
		int low = 0, high = a.length-1;
		
		while(low<=high){
			
			int mid = (low+high)/2;
			
			if(a[mid] == j){
				
				return mid;
				
			}
			
			else if(j > a[mid]){
				
				low = mid+1;
				
			}
			else{
				
				high = mid-1;
				
			}
			
			
		}
		
		
		//element not found
		return -1;
	}
	
}
