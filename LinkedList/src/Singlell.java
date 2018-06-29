public class Singlell {

	public static void main(String[] args) {

		Node n = new Node("one");

		Node n1 = new Node("two");

		Node n2 = new Node("three");

		Node n3 = new Node("four");

		 Node n4 = new Node("five");

		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);

		System.out.println("Before --->");

		System.out.println(n);

		System.out.println("After --->");

		 Node n22 = add(n, n4, 0);

		 System.out.println(n22);

		//Node n11 = del(n, 1);

		//stem.out.println(n11);

	}

	private static Node del(Node n, int i) {

		Node temp = n;

		if (i == 0) {

			n = n.getNext();

			temp.setNext(null);

			return n;

		}

		else {
			Node root = n;

			temp = n.getNext();

			// System.out.println(temp);

			for (int j = 1; j < i; j++) {

				temp = temp.getNext();

				n = n.getNext();
			}

			n.setNext(temp.getNext());

			return root;

		}

	}

	private static Node add(Node n, Node n4, int i) {

		if (i == 0) {

			n4.setNext(n);

			n = n4;

			return n;

		}

		else {

			Node root = n;

			for (int j = 1; j < i; j++) {

				n = n.getNext();

			}

			n4.setNext(n.getNext());

			n.setNext(n4);

			return root;

		}

	}

}
