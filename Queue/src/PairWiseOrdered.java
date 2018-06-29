import java.util.Stack;

public class PairWiseOrdered {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.push(1);

		s.push(2);

		s.push(3);

		s.push(4);

		//s.push(5);

		boolean res = pairOrder(s);

		System.out.println(res);

	}

	private static boolean pairOrder(Stack<Integer> s) {

		if (s.isEmpty())

			return false;

		boolean pair = true;

		int sz = s.size();

		int ele;

		
		if((sz % 2) != 0 && sz == 1){
						
			return false;
			
		}
		
		else
			if ((sz % 2) != 0){

			ele = s.pop();
		
		}
		
		
		while (!s.isEmpty()) {

			int a = s.pop();

			int b = s.pop();

			if (Math.abs(a - b) != 1) {

				pair = false;

				break;

			}

		}

		if (pair) {

			return true;
		}

		else

			return false;
	}

}
