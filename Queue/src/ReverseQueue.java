import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ReverseQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		Stack<Integer> s = new Stack<Integer>();
		
		
		q.add(1);
		
		q.add(2);
		
		q.add(3);
		
		System.out.println("Before---->"+q);
		
		while(!q.isEmpty()){
			
		int temp = q.remove();
			
		s.push(temp);
		
		}
		
		while(!s.isEmpty()){
			
			q.add(s.pop());
			
		}
		
		System.out.println("After---->"+q);
	}
	
	
}
