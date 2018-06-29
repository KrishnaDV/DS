import java.util.HashMap;
import java.util.Map;


public class RemoveDupInLl {

	public static void main(String[] args) {
		
		Node1 n = new Node1(4);

		Node1 n1 = new Node1(2);

		Node1 n2 = new Node1(5);

		Node1 n3 = new Node1(2);

		Node1 n5 = new Node1(8);

		Node1 n6 = new Node1(5);
		
		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);

		n3.setNext(n5);

		n5.setNext(n6);
		
		System.out.println(n);
		
		remDup(n);
		
		System.out.println(n);
		
	}
//
//	private static void remDup(Node1 n) {
//		
//		
//		HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
//		
//		while(n!=null){
//			
//			if(hm.containsKey(n.getData())){
//				
//				n = n.getNext();
//				
//			}
//			
//			hm.put(n.getData(),true);
//			
//			n = n.getNext();
//			
//		}
//		System.out.println(hm);
//		
//	}

	private static void remDup(Node1 n) {
		
		
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		Node1 temp = n;
		
		Node1 prev = null;
		
		while(temp!=null){
			
			if(!hm.containsKey(temp.getData())){
				prev = temp;
				hm.put(temp.getData(), 1);
				temp = temp.getNext();
			}
			else{
				prev.setNext(temp.getNext());
				temp = temp.getNext();
			}
			
		}
		
	}
	
	
}
