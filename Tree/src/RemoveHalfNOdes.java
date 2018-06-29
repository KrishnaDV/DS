import java.util.LinkedList;
import java.util.Queue;

public class RemoveHalfNOdes {

	public static void main(String[] args) {

		Tree t = new Tree(1);

		Tree t1 = new Tree(7);

		Tree t2 = new Tree(5);

		Tree t3 = new Tree(6);

		Tree t4 = new Tree(1);

		Tree t5 = new Tree(11);

		Tree t6 = new Tree(9);

		Tree t7 = new Tree(4);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setRight(t3);

		t3.setLeft(t4);

		t3.setRight(t5);

		t2.setRight(t6);

		t6.setLeft(t7);

		removeHalfNodes(t);

		System.out.println(t);

	}

	private static void removeHalfNodes(Tree t) {

		Queue<Tree> q = new LinkedList<Tree>();

		q.add(t);

		while (!q.isEmpty()) {

			Tree tmp = q.poll();

			if (tmp.getLeft() != null) {

				if (tmp.getLeft().getLeft() == null
						&& tmp.getLeft().getRight() != null) {

					tmp.setLeft(tmp.getLeft().getRight());

					q.add(tmp.getLeft().getRight());
				}

				if (tmp.getLeft().getLeft() != null
						&& tmp.getLeft().getRight() == null) {

					tmp.setLeft(tmp.getLeft().getLeft());

					q.add(tmp.getLeft().getLeft());
				}

				else {
					q.add(tmp.getLeft().getLeft());

					q.add(tmp.getLeft().getRight());
				}
			}

			if (tmp.getRight() != null) {

				if (tmp.getRight().getLeft() == null
						&& tmp.getRight().getRight() != null) {

					tmp.setRight(tmp.getRight().getRight());

					q.add(tmp.getRight().getRight());
				}

				if (tmp.getRight().getLeft() != null
						&& tmp.getRight().getRight() == null) {

					tmp.setRight(tmp.getRight().getLeft());

					q.add(tmp.getRight().getLeft());
				}

				else {
					q.add(tmp.getRight().getLeft());

					q.add(tmp.getRight().getRight());
				}
			}

		}

	}

}
