import java.util.Stack;


public class Reverse_A_Stack {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();

		st.push(1);

		st.push(2);

		st.push(3);

		st.push(4);

		System.out.println(st);
		
		revStack(st);
		
		
	}

	private static void revStack(Stack<Integer> st) {
		
		Stack<Integer> st1 = new Stack<Integer>();
		
		if(st.isEmpty()){
			
			return;
		}
		
		while(!st.isEmpty()){
			
			int temp = st.pop();
			
			st1.push(temp);
		}
		
		System.out.println(st1);
	}
	
}
