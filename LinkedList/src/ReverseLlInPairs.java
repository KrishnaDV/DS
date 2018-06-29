public class ReverseLlInPairs {

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

		System.out.println("Before--->");

		System.out.println(n);

		System.out.println("After--->");

		System.out.println(reverseInPairs(n));

	}

	private static Node1 reverseInPairs(Node1 n) {

		Node1 temp1 = null;

		Node1 temp2 = null;

		while (n != null && n.getNext() != null) {

			if (temp1 != null) {

				temp1.getNext().setNext(n.getNext());
				
			}

			temp1 = n.getNext();

			n.setNext(temp1.getNext());

			temp1.setNext(n);

			if (temp2 == null)

				temp2 = temp1;

			n = n.getNext();
		}

		return temp2;

	}

}