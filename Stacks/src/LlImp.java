
public class LlImp {

	public static void main(String[] args) {
		
		LinkedStack ll = new LinkedStack();
		
		System.out.println(ll.size());
		
		System.out.println(ll.isEmpty());
		
		ll.push(12);
		
		ll.push(1);
		
		System.out.println(ll.size());

		System.out.println(ll.peek());
		
		System.out.println(ll);
		
		
	}
	
}
