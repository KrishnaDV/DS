import java.util.LinkedList;
import java.util.Queue;

//Find size of tree or Count number of nodes in a binary tree.
public class NumberOfNodes {

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

		int res = numOfNodes(t);
		System.out.println("Total number of nodes "+res);
		int bfsRes = numOfNodesBfs(t);
		System.out.println("BFS result " + bfsRes);
	}

	private static int numOfNodes(Tree t) {
		if (t == null) {
			return 0;
		}
		return 1+numOfNodes(t.getLeft())+numOfNodes(t.getRight());
	}

	private static int numOfNodesBfs(Tree t) {
		Queue<Tree> q = new LinkedList<>();
		if (t == null) {
			return 0;
		}
		q.add(t);
		int count = 0;
		while (!q.isEmpty()) {
			Tree node = q.poll();
			count += 1;
			if (node.getLeft() != null) {
				q.add(node.getLeft());
			}
			if (node.getRight() != null) {
				q.add(node.getRight());
			}
		}
		return count;
	}
}
