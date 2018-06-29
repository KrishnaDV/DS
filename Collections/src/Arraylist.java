import java.util.ArrayList;
import java.util.List;


public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();		
		al.add("Ronaldo");
		al.add("Messi");
		al.add("Gerard");
		//System.out.println(al.indexOf("Messi"));
		al.add(1,"Rooney");
		//System.out.println(al.indexOf("Messi"));
		
		for(String o : al){
			
			//System.out.println(o);
		
		}
		
		
		//Converting ArrayList to Array
		List<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(1);
		al1.add(7);
		al1.add(4);
		al1.add(3);

		Object[] o =  al1.toArray();
	
		for(Object t : o){
			
			//System.out.println(t);
		}
		
		
		//Normal array convertion
		
		int res[] = new int[al.size()];
		
		for(int i=0;i<al1.size();i++){
			
			res[i] = al1.get(i);
		}
		
		for(int j : res){
			
			System.out.println(j);
		}
	}
}
