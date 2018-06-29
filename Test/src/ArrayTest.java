
public class ArrayTest {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		
		a[0] = 1;
		
		a[1] = 2;
		
		a[2] = 3;
		
		int b[] = new int[a.length*2];
		
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		
		for(int i : b){
			
			System.out.print(i+" ");
			
		}
		
		
	}
	
}
