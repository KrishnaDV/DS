
public class sizeOfTree {

	public static void main(String[] args) {
		
		
		Tree t = new Tree(11);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(31);

		Tree t3 = new Tree(22);

		Tree t4 = new Tree(3);		
		
		t.setLeft(t1);

		t.setRight(t2);

		t1.setRight(t3);
		
		t2.setLeft(t4);
		
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
