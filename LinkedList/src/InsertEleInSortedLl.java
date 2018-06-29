
public class InsertEleInSortedLl {

	
	private static Node1 inserEleInSort(Node1 n, Node1 n5) {
		
		Node1 root = n;
		
		Node1 temp = n ;
		
		if(n == null || n.getData()>n5.getData()){
			
			return n5;
			
		}
		
		while(n!=null && n.getData()<n5.getData()){
			
		temp = n;
			
		n = n.getNext();	
				
		}
		
		n5.setNext(n);
		
		temp.setNext(n5);
		
		return root;
		
	}

	public static void main(String[] args) {
		
		Node1 n = new Node1(1);
		
		Node1 n1 = new Node1(2);
		
		Node1 n2 = new Node1(3);
		
		Node1 n3 = new Node1(4);
		
		Node1 n5 = new Node1(5);
	
		n.setNext(n1);
		
		n1.setNext(n2);
		
		n2.setNext(n3);
		
		System.out.println("Before --->");
		
		System.out.println(n);
	
		System.out.println("After --->");
		
		Node1 out = inserEleInSort(n,n5);
		
		System.out.println(out);
	
	}
}
