import java.util.*;
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

		List<List<Integer>> res = levelOrderTraverse(t);
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
	
	public static List<List<Integer>> levelOrderTraverse(Tree root) {
        List<List<Integer>> resultList = new LinkedList<>();
        if(root == null){
            return resultList;
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> currentList = new LinkedList<>();
        while(!queue.isEmpty()){
        	Tree currentNode = queue.poll();
            if(currentNode!=null){
                currentList.add(currentNode.getData());
                if(currentNode.getLeft()!=null){
                    queue.add(currentNode.getLeft());
                }
                if(currentNode.getRight()!=null){
                    queue.add(currentNode.getRight());
                }
            }else{
                resultList.add(currentList);
                currentList = new LinkedList<>();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
        }
        return resultList;
    }

}
