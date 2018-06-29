public class BasicFun {

	public static void main(String[] args) {

		
		Node n = new Node("hi");

		Node n1 = new Node("Hello");

		Node n2 = new Node("ram");

		Node n3 = new Node("vishal");
		
		n.setNext(n1);

		n1.setNext(n2);
		
		n2.setNext(n3);

		System.out.println(n);
		
		int res = findLength(n);
		
		System.out.println("length is " +res);

	}

	private static int findLength(Node n) {
		
		int length = 0;
	
		
		while(n != null){
			
			length++;
			
			n = n.getNext();
			
		}
		
		return length;
		
	}
	
	/*

	private static void add(Node n, Node n3, int i) {

		n3.setNext(n);

		for (int j = 0; j < i - 1; j++) {

			n3.setNext(n.getNext());

			n = n.getNext();

		}

		n3.setNext(n.getNext());

		n.setNext(n3);

	}
*/

}
