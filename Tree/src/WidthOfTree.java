import java.util.LinkedList;
import java.util.Queue;

public class WidthOfTree {

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

		int res = maxWidth(t);
		System.out.println(res);
	}

	private static int maxWidth(Tree t) {
		int maxW = 0, curr = 0;
		if (t == null) {
			return 0;
		}

		// Add null at after every level in queue.
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(t);
		q.add(null);
		while (!q.isEmpty()) {
			Tree tmp = q.poll();
			if (tmp != null) {
				curr++;
				if (tmp.getLeft() != null) {
					q.add(tmp.getLeft());
				}
				if (tmp.getRight() != null) {
					q.add(tmp.getRight());
				}
			}
			// Whenever level is reached check for maximum width
			else {
				if (!q.isEmpty()) {
					q.add(null);
				}
				if (curr > maxW) {
					maxW = curr;
				}
				curr = 0;
			}
		}
		return maxW;
	}
}
