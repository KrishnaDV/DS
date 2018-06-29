import java.util.HashMap;
import java.util.Map;

public class TraverseList {

	public static void main(String[] args) {

		Node n = new Node("one");


		Node n1 = new Node("two");

		Node n2 = new Node("one");

		Node n3 = new Node("three");

		n.setNext(n1);

		n1.setNext(n2);
		
		n2.setNext(n3);

		kToLast(n, 3);

	}

	private static void kToLast(Node n, int i) {
		
		Map<Integer,Node> m = new HashMap<Integer,Node>();
		
		
		int size = 0;
		
		while(n!= null){
			
			size++;
			
			m.put(size,n);
			
			n = n.getNext();
			
		}
		
		int kFromLast = size - i;
		
		System.out.println(m.get(kFromLast));
		
	}

//	private static void kToLast(Node n, int i) {
//
//		Node temp = n;
//
//		int length = 1;
//
//		while (n.getNext() != null) {
//			n = n.getNext();
//			length++;
//			//System.out.println(ct);
//		}
//
//		int ctx = 1;
//
//		while (temp.getNext() != null) {
//
//			if (ctx == length - i) {
//
//				System.out.println(temp);
//
//			}
//			
//			temp = temp.getNext();
//
//			ctx++;
//		}
//		
//		if (ctx == length - i) {
//
//			System.out.println(temp);
//
//		}
//		
//		
//		
//	}

	/*
	 * private static void traverse(Node n, int i) {
	 * 
	 * int ctx = 1;
	 * 
	 * Node temp;
	 * 
	 * while (n.getNext() != null) {
	 * 
	 * if (ctx == i) {
	 * 
	 * // n.setNext(null);
	 * 
	 * System.out.println(n);
	 * 
	 * }
	 * 
	 * n = n.getNext();
	 * 
	 * ctx++;
	 * 
	 * }
	 * 
	 * if (ctx == i) {
	 * 
	 * // n.setNext(null);
	 * 
	 * System.out.println(n);
	 * 
	 * }
	 * 
	 * }
	 */

}
