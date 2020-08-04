import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderReverse {

	public static void main(String[] args) {

		Tree t = new Tree(1);
		Tree t1 = new Tree(2);
		Tree t2 = new Tree(3);
		Tree t3 = new Tree(4);
		Tree t4 = new Tree(5);
		Tree t5 = new Tree(6);
		Tree t6 = new Tree(7);

		t.setLeft(t1);
		t.setRight(t2);
		t1.setLeft(t3);
		t1.setRight(t4);
		t2.setLeft(t5);
		t2.setRight(t6);

		levelReverse(t);
	}

	private static void levelReverse(Tree t) {

		if (t == null) {
			return;
		}

		Queue<Tree> q = new LinkedList<Tree>();
		Stack<Integer> s = new Stack<Integer>();

		q.add(t);
		while (!q.isEmpty()) {
			Tree tmp = q.poll();
			s.push(tmp.getData());
			if (tmp.getLeft() != null) {
				q.offer(tmp.getLeft());
			}
			if (tmp.getRight() != null) {
				q.offer(tmp.getRight());
			}
		}

		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}
}
