import java.util.Stack;


public class PostOrderWithoutRecursion {

	public static void main(String[] args) {
		
		
		Tree t = new Tree(1);
		
		Tree t1 = new Tree(3);
		
		Tree t2 = new Tree(4);
		
		Tree t3 = new Tree(5);
		
		Tree t4 = new Tree(6);
		
		t.setLeft(t1);
		
		t.setRight(t2);
		
		t2.setLeft(t3);
		
		t2.setRight(t4);
		
		postorder(t);
		
	}

	private static void postorder(Tree t) {
		
		
		Stack<Tree> s = new Stack<Tree>();
		
		Stack<Tree> s2 = new Stack<Tree>();
		
		s.push(t);
		
		while(!s.isEmpty()){
			
			Tree tmp = s.pop();
			
			s2.push(tmp);
			
			if(tmp.getLeft()!=null){
				
				s.push(tmp.getLeft());
				
			}
			
			if(tmp.getRight()!=null){
				
				s.push(tmp.getRight());
				
			}
			
		}
		
		System.out.println("Postorder:");
		
		while(!s2.isEmpty()){
			
			System.out.print(s2.pop().getData()+" ");
			
		}
		
		
	}
	
}
