public class searchEle {

	public static void main(String[] args) {
		Tree t = new Tree(11);
		Tree t1 = new Tree(2);
		Tree t2 = new Tree(31);
		t.setLeft(t1);
		t.setRight(t2);
		System.out.println(t);
		boolean res = search(t, 2);
		System.out.println(res);
	}

	public static boolean search(Tree t, int i) {
		if (t == null) {
			return false;
		}
		if (t.getData() == i) {
			return true;
		}
		return search(t.getLeft(), i) || search(t.getRight(), i);
	}
}
