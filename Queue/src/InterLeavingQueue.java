import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterLeavingQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(1);

		q.add(2);

		q.add(3);

		q.add(4);

		q.add(5);
		
		q.add(6);
		
		System.out.println("Before--->" + q);

		interLeavingQueue(q);

		System.out.println("After--->"+q);
		
	}

	private static void interLeavingQueue(Queue<Integer> q) {

		Stack<Integer> s = new Stack<Integer>();

		int size = q.size() / 2;

		if ((q.size() % 2) != 0) {

			throw new IllegalArgumentException();

		}

		for (int i = 0; i < size; i++) {

			s.push(q.remove());

		}

		while (!s.isEmpty()) {

			q.add(s.pop());

		}

		for (int i = 0; i < size; i++) {

			q.add(q.remove());

		}

		for (int i = 0; i < size; i++) {

			s.push(q.remove());

		}

		while (!s.isEmpty()) {

			q.add(s.pop());

			q.add(q.remove());

		}

	}
}
