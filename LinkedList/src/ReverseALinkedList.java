
public class ReverseALinkedList {

	
	public static void main(String[] args) {
		
		Node1 n = new Node1(1);
		
		Node1 n1 = new Node1(2);
		
		Node1 n2 = new Node1(4);
		
		Node1 n3 = new Node1(5);

		n.setNext(n1);
		
		n1.setNext(n2);
		
		n2.setNext(n3);
	
		System.out.println("Before--->");
		
		System.out.println(n);

		System.out.println("After--->");
		
	
		Node1 res = reverseLl(n);
		
		System.out.println(res);
		
	}

	private static Node1 reverseLl(Node1 head) {
		
		Node1 current = head;
		
		Node1 prev = null;
		
		Node1 next = null;
		
		while(current!=null){
			
			 next = current.getNext();
			
			current.setNext(prev);
			
			prev = current;
			
			current = next;
			
		}
		
		return prev;
	}

}
