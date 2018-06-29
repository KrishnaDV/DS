import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal {

	public static void main(String[] args) {
		
		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);
		
		Tree t3 = new Tree(4);

		Tree t4 = new Tree(5);

		Tree t5 = new Tree(6);
		
		Tree t6 = new Tree(7);
		
		t.setLeft(t1);
		
		t.setRight(t2);
		
		t1.setLeft(t3);
		
		t1.setRight(t4);
		
		t2.setLeft(t5);
		
		t2.setRight(t6);
		
		
		ArrayList<ArrayList<Integer>> res = levelOrder(t);
	
		System.out.println(res);
		
	}
	
	
	public static ArrayList<ArrayList<Integer>> levelOrder(Tree root){
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> nv = new ArrayList<Integer>();
		
		if(root == null){
			
			return al;
		}
		
		Queue<Tree> curr = new LinkedList<Tree>();
		
		Queue<Tree> next = new LinkedList<Tree>();
		
		curr.add(root);
		
		while(!curr.isEmpty()){
			
			Tree tmp = curr.remove();
			
			if(tmp.getLeft()!=null){
				
				next.add(tmp.getLeft());
			}
			
			if(tmp.getRight()!=null){
				
				next.add(tmp.getRight());
			}
			
			nv.add(tmp.getData());
			
			if(curr.isEmpty()){
				
				curr = next;
				
				next = new LinkedList<Tree>();
				
				al.add(nv);
				
				nv = new ArrayList<Integer>();
				
				
			}
			
			
		}
		
		return al;
		
		
	}
	
	
}
