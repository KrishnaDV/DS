public class Traversal {

	public static void main(String[] args) {

		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		t.setLeft(t1);

		t.setRight(t2);

		System.out.println(t);

		System.out.println("Preorder");

		preOrder(t);

		System.out.println(" ");

		System.out.println("Inorder");

		inOrder(t);

		System.out.println(" ");

		System.out.println("Postorder");

		postOrder(t);

	}

	private static void preOrder(Tree t) {

		if (t != null) {

			System.out.print(t.getData()+" ");

			preOrder(t.getLeft());

			preOrder(t.getRight());

		}else {
			return;
		}

	}

	private static void inOrder(Tree t) {

		if (t != null) {

			inOrder(t.getLeft());

			System.out.print(t.getData() + " ");

			inOrder(t.getRight());

		}
	}

	private static void postOrder(Tree t) {

		if (t != null) {

			postOrder(t.getLeft());

			postOrder(t.getRight());

			System.out.print(t.getData()+" ");

		}

	}
}
