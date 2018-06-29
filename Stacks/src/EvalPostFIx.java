import java.util.Stack;

public class EvalPostFIx {

	public static void main(String[] args) {

		String inp = "2345-*+";
		
		int res = evalPf(inp);
		
		System.out.println(res);

	}

	private static int evalPf(String in) {

		Stack<Integer> st = new Stack<Integer>();
		
		
		if(in == null || in.length() == 0 || in == " "){
			
			return 0;
		}

		for (int i=0;i<in.length();i++) {

			if (in.charAt(i)=='+') {

				int a = st.pop();
				
				int b = st.pop();
				
				int res = a + b;
				
				st.push(res);

			}

			else if (in.charAt(i)=='-') {

				int a = st.pop();

				int b = st.pop();

				int res = b - a;
				
				st.push(res);

			}

			else if (in.charAt(i)=='*') {

				int a = st.pop();

				int b = st.pop();

				int res = a * b;

				st.push(res);

			}

			else if (in.charAt(i)=='/') {

				int a = st.pop();

				int b = st.pop();

				int res = b / a;

				st.push(res);

			}
			
			else{
				
				String s = String.valueOf(in.charAt(i));
				
				int a = Integer.parseInt(s);
			
				st.push(a);
				
			}
			
		}
		
		return st.pop();
		}

}
