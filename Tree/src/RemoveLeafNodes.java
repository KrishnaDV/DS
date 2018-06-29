import java.util.LinkedList;
import java.util.Queue;

public class RemoveLeafNodes {

	public static void main(String[] args) {

		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		Tree t3 = new Tree(4);

		Tree t4 = new Tree(5);

		Tree t5 = new Tree(6);

		Tree t6 = new Tree(7);
		
		Tree t7 = new Tree(8);
		
		Tree t8 = new Tree(9);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);

		t4.setLeft(t7);
		
		t4.setRight(t8);
		
		t2.setLeft(t5);

		t2.setRight(t6);

		removeLeaf(t);
		
		System.out.println(t);

	}

	private static void removeLeaf(Tree t) {

		if (t == null) {

			return;

		}

		Queue<Tree> q = new LinkedList<Tree>();

		q.add(t);

		while (!q.isEmpty()) {

			Tree tmp = q.poll();

			if (tmp.getLeft() != null) {

				if (tmp.getLeft().getLeft() == null
						&& tmp.getLeft().getRight() == null) {


					//System.out.println(tmp.getLeft().getData());
					
					tmp.setLeft(null);
					
				}

				else {

					q.add(tmp.getLeft());

				}

			}

			if (tmp.getRight() != null) {

				if (tmp.getRight().getLeft() == null
						&& tmp.getRight().getRight() == null) {

					//System.out.println(tmp.getRight().getData());
					
					tmp.setRight(null);

				}

				else {

					q.add(tmp.getRight());

				}

			}
		}

	}

}
