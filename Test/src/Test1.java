
import java.util.*;


public class Test1 {

	public static void main(String[] args) {
		
		
		int a[] = {1,4,6,1,5,3,1};
		
		List<Integer> al = new ArrayList<Integer>();
		
		
		Map<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();
		
		for(int key : a){
			
			if(!lhm.containsKey(key)){
				lhm.put(key,1);				
			}
			else{
				
				lhm.put(key,0);
			}
		}
		
		Set<Integer> ks = lhm.keySet();
		
		for(int i : ks){
			
			if(lhm.get(i) == 1){
				
				al.add(i);
			}
			
		}
		
		int res[] = new int[al.size()];

		for(int i=0; i < al.size();i++){
			
			res[i] = al.get(i);
			
		}
		
		for(int g : res){
			System.out.print(g+" ");
		}
		
	}
	
}
