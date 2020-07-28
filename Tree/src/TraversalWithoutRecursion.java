import java.util.Stack;

public class TraversalWithoutRecursion {
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
		s.push(t);
		while (!s.isEmpty()) {
			Tree current = s.pop();
			System.out.print(current.getData() + " ");
			if(current.getRight()!=null) {
				s.push(current.getRight());
			}
			if(current.getLeft()!=null) {
				s.push(current.getLeft());
			}
		}
	}
}
