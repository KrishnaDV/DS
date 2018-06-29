
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		
		Node1 n = new Node1(1);

		Node1 n1 = new Node1(8);

		Node1 n2 = new Node1(13);

		Node1 n3 = new Node1(19);

		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);
		
		System.out.println("LL1-->");
		
		System.out.println(n);
		
		//findNodefromEnd(n,3);


		Node1 n4 = new Node1(4);

		Node1 n5 = new Node1(6);
		
		Node1 n6 = new Node1(9);

		n4.setNext(n5);
		
		n5.setNext(n2);
		
		n5.setNext(n6);
		
		System.out.println("LL2--->");
		
		System.out.println(n4);
		
		System.out.println("Result");
	
		mergeTwoLists(n,n4);
		
		
	}

	private static void mergeTwoLists(Node1 n, Node1 n4) {
		
		Node1 head = new Node1(Integer.MIN_VALUE);
		
		Node1 current = head;
		
		while(n!=null && n4!=null){
			
			if(n.getData()<=n4.getData()){
				
				current.setNext(n);
				
				n = n.getNext();
				
				current = current.getNext();
				
			}
			else{
			current.setNext(n4);
			
			n4 = n4.getNext();
			
			current = current.getNext();
			
			}
		}
		
		if(n!=null){
			
			current.setNext(n);
			
		}
		else if(n4!=null){
			
			current.setNext(n4);
			
		}
		System.out.println(head.getNext());
	}
}
