import java.util.Stack;

public class TraversalWithoutRecursion {
	public static void main(String[] args) {

		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		Tree t3 = new Tree(4);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		preorder(t);

		System.out.println();
		
		inorder(t);

	}

	private static void inorder(Tree t) {
		
		System.out.println("Inorder");

		Stack<Tree> s = new Stack<Tree>();

		while (true) {

			while (t != null) {

				s.push(t);

				t = t.getLeft();

			}

			if (s.isEmpty()) {

				return;
			}

			t = s.pop();
			
			System.out.print(t.getData() + " ");

			t = t.getRight();

		}

	}

	private static void preorder(Tree t) {

		System.out.println("Preorder");

		Stack<Tree> s = new Stack<Tree>();

		while (true) {

			while (t != null) {

				System.out.print(t.getData() + " ");

				s.push(t);

				t = t.getLeft();

			}

			if (s.isEmpty()) {

				return;
			}

			t = s.pop();

			t = t.getRight();
	
		}

		
		
	}
}
