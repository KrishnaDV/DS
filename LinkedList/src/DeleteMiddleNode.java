public class DeleteMiddleNode {
	public static void main(String[] args) {

		Node n = new Node("one");

		Node n1 = new Node("two");

		Node n2 = new Node("three");

		Node n3 = new Node("four");

		Node n5 = new Node("five");

		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);

		System.out.println("Before --->");

		System.out.println(n);

		// boolean a = delMiddleN(n2);

		delAnyNode(n, n3);


	}

	private static void delAnyNode(Node head, Node n2) {

		System.out.println("After --->");
		
		Node temp = head;
		
		if (head == n2) {

			head = head.getNext();
			
			System.out.println(head);
			return;

		}

		else {
			while (head.getNext() != null) {
				if (head.getNext() != n2) {

					head = head.getNext();

				} else {

					head.setNext(head.getNext().getNext());
				}
			}
			System.out.println(temp);
		}
	}
}

// private static boolean delMiddleN(Node n2) {
//
// if (n2.getNext() == null || n2 == null) {
// return false;
// }
//
// Node temp = n2.getNext();
//
// n2.setData(temp.getData());
//
// n2.setNext(temp.getNext());
//
// return true;
// }
