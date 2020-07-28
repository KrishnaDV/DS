
public class sizeOfTree {

	public static void main(String[] args) {
		
		Tree t = new Tree(1);
		Tree t1 = new Tree(2);
		Tree t2 = new Tree(3);
		Tree t3 = new Tree(4);
		Tree t4 = new Tree(5);
		Tree t5 = new Tree(6);
		Tree t6 = new Tree(7);
		
		t.setLeft(t1);
		t.setRight(t2);
		t1.setLeft(t3);
		t1.setRight(t4);
		t2.setLeft(t5);
		t2.setRight(t6);
		
		System.out.println(t);
		
		int res = size(t);
		
		System.out.println(res);
		
	}

	private static int size(Tree t) {
	
		
		int leftcount = t.getLeft() == null ? 0 :size(t.getLeft());
		
		int rightcount = t.getRight() == null ? 0 :size(t.getRight());
		
		
	return 1+leftcount+rightcount;
		
	}
	
}
