
public class StructurallyIdentical {

	public static void main(String[] args) {
		
		Tree t = new Tree(11);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(31);

		Tree t3 = new Tree(22);

		Tree t4 = new Tree(3);

		Tree t5 = new Tree(45);
		
		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);
		
		t3.setLeft(t5);
		
		t4.setLeft(t5);
		
		boolean res = checkStructure(t,t1);
		
		System.out.println(res);
		
		
	}

	private static boolean checkStructure(Tree t, Tree t2) {
		
		
		if(t == null && t2 == null){
			
			return true;
			
		}
		
		if(t == null || t2 == null){
			
			return false;
			
		}
		
		return checkStructure(t.getLeft(),t2.getLeft()) && checkStructure(t.getRight(),t2.getRight()) && t.getData() == t2.getData();
	}
	
}
