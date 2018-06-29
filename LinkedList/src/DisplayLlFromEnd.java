import java.util.Stack;

public class DisplayLlFromEnd {

	public static void main(String[] args) {

		Node n = new Node("hi");

		Node n1 = new Node("Hello");

		Node n2 = new Node("ram");

		n.setNext(n1);

		n1.setNext(n2);

		displRev(n);
		
		dispRevStack(n);
	}

	private static void dispRevStack(Node n) {
		
		Stack<String> s = new Stack<String>();
		
		while(n!=null){
			
			s.push(n.getData());
			n = n.getNext();	
		}
		
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}

	private static void displRev(Node n) {

		if (n == null) {

			return;

		}
		displRev(n.getNext());
		System.out.println(n.getData());

	}

}
