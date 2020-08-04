import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {

	public static void main(String[] args) {

		Tree t = new Tree(1);
		Tree t1 = new Tree(2);
		Tree t2 = new Tree(3);
		Tree t3 = new Tree(4);
		Tree t4 = new Tree(5);
		Tree t5 = new Tree(6);

		t.setLeft(t1);
		t.setRight(t2);
		t1.setLeft(t3);
		t1.setRight(t4);
		t2.setLeft(t5);

		System.out.println(t);
		Tree res = deepest(t);
		System.out.println("Deepest Node "+res.getData());
	}

	private static Tree deepest(Tree t) {
		if (t == null) {
			return null;
		}

		Queue<Tree> q = new LinkedList<Tree>();
		q.add(t);
		Tree tmp = null;
		while (!q.isEmpty()) {
			tmp = q.poll();
			if (tmp.getLeft() != null) {
				q.add(tmp.getLeft());
			}
			if (tmp.getRight() != null) {
				q.add(tmp.getRight());
			}
		}
		return tmp;
	}

}
