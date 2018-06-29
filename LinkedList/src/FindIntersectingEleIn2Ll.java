import java.util.HashMap;

public class FindIntersectingEleIn2Ll {

	public static void main(String[] args) {

		Node n = new Node("hi");

		Node n1 = new Node("Hello");

		Node n2 = new Node("ram");

		Node n3 = new Node("vishal");

		n.setNext(n1);

		n1.setNext(n2);

		n2.setNext(n3);
		
		System.out.println("LL1-->");
		
		System.out.println(n);
		
		//findNodefromEnd(n,3);


		Node n4 = new Node("hi,");

		Node n5 = new Node("hello");
		
		Node n6 = new Node("teja");

		n4.setNext(n5);
		
		n5.setNext(n2);
		
		//n5.setNext(n6);
		
		System.out.println("LL2--->");
		
		System.out.println(n4);
		
		boolean res = findMergeNode(n,n4);
		
		System.out.println(res);
		
	}

	private static boolean findMergeNode(Node n, Node n4) {
		
		HashMap<Node, Integer> hm = new HashMap<Node, Integer>();

		int pos = 0;
		
		while(n!=null){
			
		hm.put(n,pos);
		
		n = n.getNext();
		
		pos++;
		
		}
		
		while(n4!=null){
			
			if(hm.containsKey(n4)){
				
				System.out.println("Merge Point Found ");
				
				System.out.println(n4);
				
				return true;
			}

			n4 = n4.getNext();
			
		}
		
		return false;
		
	}

	/*
	private static void findNodefromEnd(Node n, int i) {

		HashMap<Integer, Node> hm = new HashMap<Integer, Node>();

		int pos = 0;

		while (n != null) {

			hm.put(pos, n);

			n = n.getNext();
			
			pos++;
			
		}

	int length = (pos) - i;
	
	Node res = hm.get(length-1);
	
	System.out.println(res);
		
	}
*/
	
	
	
}
