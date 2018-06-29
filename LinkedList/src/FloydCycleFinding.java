public class FloydCycleFinding {

	public static void main(String[] args) {

		Node n = new Node("hi");

		Node n1 = new Node("Hello");

		Node n2 = new Node("ram");

		Node n3 = new Node("vishal");

		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);

		 n3.setNext(n2);

		//System.out.println(n);

		boolean res = findIfLoopExixts(n);

		System.out.println(res);

	}

	private static boolean findIfLoopExixts(Node n) {

		Node sptr = n;
		Node fptr = n;

		while (fptr != null && fptr.getNext() != null) {

			fptr = fptr.getNext().getNext();

			sptr = sptr.getNext();

			if (fptr == sptr) {

				return true;

			}

		}
		return false;

	}

}
