public class FindModNode {

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

		// Node1 res = findMod(n,3);

		Node1 res = findModular(n, 4);

		System.out.println(res);

	}

	private static Node1 findModular(Node1 n, int i) {

		if (i <= 0 || n == null) {
			return null;
		}

		Node1 mod = null;

		int r = 1;

		for (Node1 temp = n; temp != null; temp = temp.getNext()) {

			if (r % i == 0) {

				mod = temp;
			}
			r++;
		}

		return mod;
	}

	// private static Node1 findMod(Node1 n, int i) {
	//
	// int length = 0;
	//
	// Node1 mod = null;
	//
	// while(n!=null){
	//
	// if(length%i==0){
	//
	// mod = n;
	//
	// }
	//
	// length++;
	//
	// n = n.getNext();
	// }
	//
	// return mod;
	// }

}
