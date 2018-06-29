public class DiameterOfTree {

	public static void main(String[] args) {

		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		Tree t3 = new Tree(4);

		Tree t4 = new Tree(5);

		Tree t5 = new Tree(8);

		Tree t6 = new Tree(6);

		Tree t7 = new Tree(7);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);

		t2.setRight(t5);

		t5.setLeft(t6);

		t5.setRight(t7);

		int res = dia(t);

		System.out.println(res);
	}

	private static int dia(Tree t) {
		
		if(t == null){
			
			return 0;
			
		}
		
		int left = dia(t.getLeft());
		
		int right = dia(t.getRight());
		
		
		int len1 = Math.max(left, right);
		
		
		int len2 = height(t.getLeft()) + height(t.getRight()) + 1;
		
		return Math.max(len1,len2);
	}

	private static int height(Tree left) {
		
		if(left == null){
			
			return 0;
			
		}
		
		int lh = height(left.getLeft());
		
		int rh = height(left.getRight());
		
		return 1+Math.max(lh, rh);
	}


}
