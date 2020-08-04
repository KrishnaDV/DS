public class InsertEle {

	public static void main(String[] args) {

		Tree t = new Tree(11);
		Tree t1 = new Tree(2);
		Tree t2 = new Tree(31);

		t.setLeft(t1);
		t.setRight(t2);

		System.out.println(t);
		insert(t, 3);
		System.out.println(t);

	}

	private static void insert(Tree t, int i) {
		if (t == null) {
			t = new Tree(i);
		} else {
			insertHelper(t, i);
		}
	}

	private static void insertHelper(Tree t, int i) {

		//If current ele is greater than the value to insert, insert in left subtree.
		if (t.getData() >= i) {
			if (t.getLeft() == null) {
				t.setLeft(new Tree(i));
			} else {
				insertHelper(t.getLeft(), i);
			}
		}

		else {
			if (t.getRight() == null) {
				t.setRight(new Tree(i));
			} else {
				insertHelper(t.getRight(), i);
			}
		}
	}

}
