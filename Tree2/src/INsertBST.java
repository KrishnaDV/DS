
public class INsertBST {

	public static void main(String[] args) {
		
		Tree t = new Tree(22);
		
		Tree res = insert(t,25);
		
		Tree res1 = insert(t,15);
		
		Tree res2 = insert(t,45);
		
		Tree res3 = insert(t,20);
		
		System.out.println(t);
		
		
		
	}

	private static Tree insert(Tree t, int i) {

		Tree t1 = new Tree(i);
		
		if(t == null){
		
			return t1;
			
		}
		//val is inserted in left sub-tree
		if(i<t.getData()){
			
			t.setLeft(insert(t.getLeft(),i));
			
		}
		
		//val is inserted in right sub-tree
		else if(i>t.getData()){
			
			t.setRight(insert(t.getRight(),i));
			
		}
		
		
		//val is already present in tree, so return
		else{
			
			return t;
			
		}
		
		return t;
	}
	
	
	
}
