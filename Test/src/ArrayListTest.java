import java.util.ArrayList;

public class ArrayListTest {
	// When you assign one al to another just reference is assigned to assign a copy use (new()) to create new object.
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i=0;i<10;i++){
			
			al.add(i);
			
		}
		
		System.out.println(al);
		
		
		//Copy Assignment
		ArrayList<Integer> a3 = new ArrayList<Integer>(al);
		
		a3.clear();
		
		System.out.println(al);
		
		
		//Reference Assignment
		ArrayList<Integer>a2 = al;
		
		a2.clear();
		
		System.out.println(al);
		
	}

}
