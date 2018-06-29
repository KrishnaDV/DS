import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstkElements {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(1);

		q.add(2);

		q.add(3);

		q.add(4);

		q.add(5);

		q.add(6);

		System.out.println("Before--->" + q);

		reverseKEle(4, q);

		System.out.println("After--->" + q);

	}

	private static void reverseKEle(int k, Queue<Integer> q) {

		if(q == null || k > q.size()){
			
			throw new IllegalArgumentException();
			
		}
		
		
		Stack<Integer> s = new Stack<Integer>();

		for (int i = 0; i < k; i++) {

			s.push(q.remove());

		}

		while (!s.isEmpty()) {

			q.add(s.pop());

		}

		for (int i = 0; i < q.size() - k; i++) {

			q.add(q.remove());

		}

	}
}
