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

		}

		else {

			insert1(t, i);

		}
	}

	private static void insert1(Tree t, int i) {

		if (t.getData()>=i) {

			if (t.getLeft() == null) {

				t.setLeft(new Tree(i));

			}

			else {

				insert1(t.getLeft(), i);
			}

		}

		else {

			if (t.getRight() == null) {

				t.setRight(new Tree(i));

			}

			else {

				insert1(t.getRight(), i);
			}

		}
	}

}
