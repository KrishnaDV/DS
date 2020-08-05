public class FindEleInBst {
	public static void main(String[] args) {
		Tree t = new Tree(1);
		Tree t1 = new Tree(2);
		Tree t2 = new Tree(3);
		Tree t3 = new Tree(4);
		Tree t4 = new Tree(5);

		t2.setLeft(t);
		t.setRight(t1);
		t2.setRight(t4);
		t4.setLeft(t3);

		boolean res = findBst(t2, 18);
		System.out.println(res);
		boolean recRes = findBstRec(t2,18);
		System.out.println(recRes);
	}
	
	

	private static boolean findBstRec(Tree t2, int i) {
		if(t2==null) {
			return false;
		}
		if(t2.getData()==i) {
			return true;
		}
		return i<t2.getData()?findBstRec(t2.getLeft(),i):findBstRec(t2.getRight(),i);
	}



	private static boolean findBst(Tree t2, int i) {

		if (t2 == null) {
			return false;
		}

		while (t2 != null) {
			if (i == t2.getData()) {
				return true;
			}
			if (i > t2.getData()) {
				t2 = t2.getRight();
			}
			else {
				t2 = t2.getLeft();
			}
		}
		return false;
	}
}
