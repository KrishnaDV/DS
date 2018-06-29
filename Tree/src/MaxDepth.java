import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
	public static void main(String[] args) {

		Tree t = new Tree(11);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(31);

		Tree t3 = new Tree(22);

		Tree t4 = new Tree(3);

		Tree t5 = new Tree(45);
		
		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);
		
		t3.setLeft(t5);
		
		t4.setLeft(t5);
		
		System.out.println(t);

		int res = maxDepth(t);

		System.out.println(res);
		
	}

	private static int maxDepth(Tree t) {
		
		int count = 0;

		Queue<Tree> q = new LinkedList<Tree>();

		q.add(t);

		q.add(null);

		while (!q.isEmpty()) {

			Tree tmp = q.poll();

			if (tmp == null) {

				if (!q.isEmpty()) {

					q.add(null);
				
					
					
				}
				
				count++;

			}

			else {

				if (tmp.getLeft() != null) {

					q.add(tmp.getLeft());
				}
				if (tmp.getRight() != null) {

					q.add(tmp.getRight());

				}

			}

		}

		return count;
	}
}
