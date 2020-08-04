import java.util.LinkedList;
import java.util.Queue;

public class SumOfAllEle {

	public static void main(String[] args) {

		Tree t = new Tree(11);
		Tree t1 = new Tree(2);
		Tree t2 = new Tree(3);
		Tree t3 = new Tree(22);
		Tree t4 = new Tree(3);
		Tree t5 = new Tree(45);

		t.setLeft(t1);
		t.setRight(t2);
		t1.setLeft(t3);
		t1.setRight(t4);
		t3.setLeft(t5);
		// t4.setLeft(t5);
		int res = sumAllRecursive(t);
		System.out.println(res);
		int bfsSum = sumAll(t);
		System.out.println("Level Order Sum " + bfsSum);
	}

	private static int sumAll(Tree t) {
		if (t == null) {
			return 0;
		}
		int sum = 0;
		Queue<Tree> q = new LinkedList<>();
		q.add(t);
		while (!q.isEmpty()) {
			Tree current = q.poll();
			sum += current.getData();
			if (current.getLeft() != null) {
				q.add(current.getLeft());
			}
			if (current.getRight() != null) {
				q.add(current.getRight());
			}
		}
		return sum;
	}

	private static int sumAllRecursive(Tree t) {
		if (t == null) {
			return 0;
		}
		return t.getData() + sumAllRecursive(t.getLeft()) + sumAllRecursive(t.getRight());
	}

}
