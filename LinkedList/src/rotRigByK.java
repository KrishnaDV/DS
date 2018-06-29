public class rotRigByK {
	public static void main(String[] args) {

		Node1 n = new Node1(1);

		Node1 n1 = new Node1(2);

		Node1 n2 = new Node1(3);

		Node1 n3 = new Node1(4);

		Node1 n5 = new Node1(5);

		Node1 n6 = new Node1(6);

		n.setNext(n1);

		 n1.setNext(n2);

		 n2.setNext(n3);

		 n3.setNext(n5);

		 n5.setNext(n6);

		System.out.println(n);

		Node1 res = rotRight(n, 2);

		System.out.println(res);

	}

	private static Node1 rotRight(Node1 head, int k) {

		int length = 0;

		Node1 curr = head;

		Node1 tmp = head;

		Node1 tmp2 = null;

		Node1 root = null;

		while (curr != null) {

			length++;

			curr = curr.getNext();

		}

		int lp = length - k;

		if (lp <= 0) {

			System.out.println("cant rotate");
		
			return null;
		}
		for (int i = 1; i < lp; i++) {

			tmp = tmp.getNext();

		}

		tmp2 = tmp.getNext();

		tmp.setNext(null);

		root = tmp2;

		while (tmp2 != null && tmp2.getNext() != null) {

			tmp2 = tmp2.getNext();
		}

		tmp2.setNext(head);

		return root;
	}
}
