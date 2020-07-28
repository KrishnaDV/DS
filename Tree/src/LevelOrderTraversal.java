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
		doBfs(t);
	}

	private static void doBfs(Tree t) {
		System.out.print("BFS result : ");
		Queue<Tree> q = new LinkedList<>();
		q.add(t);
		while(!q.isEmpty()) {
			Tree current = q.poll();
			System.out.print(current.getData()+" ");
			if(current.getLeft()!=null) {
				q.add(current.getLeft());
			}
			if(current.getRight()!=null) {
				q.add(current.getRight());
			}
		}
	}

	public static ArrayList<ArrayList<Integer>> levelOrder(Tree root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> nv = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		Queue<Tree> curr = new LinkedList<Tree>();
		Queue<Tree> next = new LinkedList<Tree>();
		curr.add(root);
		while (!curr.isEmpty()) {
			Tree tmp = curr.remove();
			if (tmp.getLeft() != null) {
				next.add(tmp.getLeft());
			}
			if (tmp.getRight() != null) {
				next.add(tmp.getRight());
			}
			nv.add(tmp.getData());
			if (curr.isEmpty()) {
				curr = next;
				next = new LinkedList<Tree>();
				result.add(nv);
				nv = new ArrayList<Integer>();
			}
		}
		return result;
	}

}
