public class IsBst {

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
		
		boolean res = isBst(t);

		System.out.println(res);
		
	}

	private static boolean isBst(Tree t) {

		int min = Integer.MIN_VALUE;

		int max = Integer.MAX_VALUE;

		return isBst(t, min, max);
	}

	private static boolean isBst(Tree t, int min, int max) {

		if (t == null) {

			return true;

		}

		// At every node check if it is greater than min and less than max. 
		//While traversing left sub-tree assign prev node data as max and repeat the process.
		//While traversing right sub-tree assign prev node data as min and repeat the process
		return (t.getData() > min) && (t.getData() < max)
				&& isBst(t.getLeft(), min, t.getData())
				&& isBst(t.getRight(), t.getData(), max);
	}

}
