

public class InOrderBst {

	public static void main(String[] args) {
		
		
		Tree t = new Tree(20);

		Tree t1 = new Tree(8);

		Tree t2 = new Tree(22);

		Tree t3 = new Tree(4);

		Tree t4 = new Tree(12);

		Tree t5 = new Tree(10);

		Tree t6 = new Tree(14);		
		
		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);
		
		t1.setRight(t4);

		t4.setLeft(t5);
		
		t4.setRight(t6);
		
		System.out.println(t);
		
		inOrderBst(t);
		
		
	}

	private static void inOrderBst(Tree t) {
		
		if(t == null){
			
			return;
			
		}
		
		inOrderBst(t.getLeft());
		
		System.out.print(t.getData()+" ");
		
		inOrderBst(t.getRight());
		
	}
	
}
