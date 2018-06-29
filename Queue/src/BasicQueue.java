import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		
		q.add(2);
		
		q.add(3);
		
		System.out.println(q);
		
		System.out.println(q.remove());
		
		System.out.println(q);
		
	}
	
}
