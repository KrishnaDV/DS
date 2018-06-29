import java.util.Stack;

//Given LL l1->l2->l3->....->l n-1 -> l n return L1->Ln->L2->Ln-1...
public class RenderLl {
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

//	 n5.setNext(n6);

     System.out.println(n);	

	renderLl(n);
	
	System.out.println(n);
	
}

private static void renderLl(Node1 head) {
	
	Node1 sptr = head;
	
	if(head == null){
		
		return;
	}
	
	Node1 fptr = head.getNext();
	
	Stack<Node1> st = new Stack<Node1>();
	
	while(fptr!=null && fptr.getNext()!=null){
		
		fptr = fptr.getNext().getNext();
		
		sptr = sptr.getNext();
	}
	
	Node1 tmp = sptr.getNext();
	
	sptr.setNext(null);
	
	while(tmp!=null){
		
		Node1 tmp2 = tmp;
	
		tmp = tmp.getNext();
		
		tmp2.setNext(null);
		
		st.push(tmp2);

	}
	
	while(!st.isEmpty()){

		Node1 tmp2 = st.pop();
		
		tmp2.setNext(head.getNext());
		
		head.setNext(tmp2);
		
		head = tmp2.getNext();
	}
	
}
}
