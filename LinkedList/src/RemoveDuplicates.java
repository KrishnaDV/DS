import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Node n = new Node("One");

		Node n1 = new Node("one");

		Node n2 = new Node("one");

		Node n3 = new Node("one");

		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);
		
		System.out.println("Before --->");

		System.out.println(n);

		removeDup(n);

		System.out.println("After --->");
		
		System.out.println(n);
	}

	private static void removeDup(Node n) {

		HashSet<String> hs = new HashSet<String>();

		Node temp = n;

		while (n != null) {

			if (hs.contains(n.getData())) {
				
				temp.setNext(n.getNext());

			} else {

				hs.add(n.getData());

				temp = n;

			}

			n = n.getNext();
		}

	}

}
