import java.util.ArrayList;

public class KsmallestinBst {

	public static void main(String[] args) {
		
		

		Tree t = new Tree(20);

		Tree t1 = new Tree(8);

		Tree t2 = new Tree(22);

		Tree t3 = new Tree(4);

		Tree t4 = new Tree(12);

		Tree t5 = new Tree(10);

		Tree t6 = new Tree(14);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);

		t4.setLeft(t5);

		t4.setRight(t6);

		int res = kSmallBst(t,1); // 1 indicates 1 smallest element in list
	
		
		System.out.println(res);

		
	}

	private static int kSmallBst(Tree t, int i) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
 		
		inOrderBst(t,al);
		
		System.out.println(al);
		
		return al.get(i-1);
	}

	// Do inorder traversal and store elements into al. retreive based on given value. 
	private static void inOrderBst(Tree t, ArrayList<Integer> al) {
		
		
		if (t == null) {

			return;

		}

		inOrderBst(t.getLeft(),al);

		al.add(t.getData());

		inOrderBst(t.getRight(),al);

		
	}

}