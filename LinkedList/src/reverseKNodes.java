
public class reverseKNodes {

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
		
		Node1 res = revKnodes(n,2);
		
		System.out.println(res);
		
	}

	private static Node1 revKnodes(Node1 n, int i) {
		
		int count = i;
		
		Node1 curr = n;
		
		Node1 prev = null;
		
		Node1 next = null;
		
		while(curr!=null && count>0){
			
			next = curr.getNext();
			
			curr.setNext(prev);
			
			prev = curr;
			
			curr = next;
			
			count--;
		}
		
		if(next!=null){
			
			n.setNext(revKnodes(next,i));
			
		}
		return prev;
	}
	
}
