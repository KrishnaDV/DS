import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversal {

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

		ArrayList<ArrayList<Integer>> res = zigZag(t);

		System.out.println(res);

	}

	private static ArrayList<ArrayList<Integer>> zigZag(Tree t) {

		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> curr = new ArrayList<Integer>();

		if (t == null) {

			return null;

		}

		Queue<Tree> q = new LinkedList<Tree>();

		q.add(t);

		q.add(null);

		boolean ltor = true;

		while (!q.isEmpty()) {

			Tree tmp = q.poll();

			if (tmp != null) {

				curr.add(tmp.getData());

				if (tmp.getLeft() != null) {

					q.add(tmp.getLeft());

				}

				if (tmp.getRight() != null) {

					q.add(tmp.getRight());

				}

			}

			else {

				if (ltor) {
// while copying array list objects use a new arraylist ref otherwise java will clear reference.					
					ArrayList<Integer> a = new ArrayList<Integer>(curr);
					
					al.add(a);

					curr.clear();

				} else {

					Stack<Integer> st = new Stack<Integer>();

					st.addAll(curr);

					ArrayList<Integer> a = new ArrayList<Integer>();

					while (!st.isEmpty()) {

						a.add(st.pop());

					}

					al.add(a);

					curr.clear();

				}

				if (!q.isEmpty()) {

					q.add(null);

					ltor = !ltor;
				}
			}

		}

		return al;
	}
}
