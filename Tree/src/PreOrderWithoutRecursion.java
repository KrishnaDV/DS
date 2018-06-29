import java.util.Stack;

public class PreOrderWithoutRecursion {

	public static void main(String[] args) {

		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		Tree t4 = new Tree(4);

		Tree t5 = new Tree(5);


		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t4);

		t1.setRight(t5);

		preOrder(t);
		
	}

	private static void preOrder(Tree t) {

		if (t == null) {

			return;

		}

		Stack<Tree> s = new Stack<Tree>();

		s.push(t);

		while (!s.isEmpty()) {

			Tree tmp = s.pop();

			System.out.print(tmp.getData()+" ");

			if (tmp.getRight()!= null) {

				s.push(tmp.getRight());

			}

			if (tmp.getLeft() != null) {

				s.push(tmp.getLeft());
			}

		}

	}

}
