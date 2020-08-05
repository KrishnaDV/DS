import java.util.HashMap;

public class VerticalSUm {

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

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		vSum(t, hm, 0);
		System.out.println("vsum");
		for (int k : hm.keySet()) {
			System.out.println("Key " + k + " Value " + hm.get(k));
		}
	}

	private static void vSum(Tree t, HashMap<Integer, Integer> hm, int c) {
		if (t == null) {
			return;
		}
		int data = 0;
		if (hm.containsKey(c)) {
			data = hm.get(c);
		}
		hm.put(c, t.getData() + data);
		if (t.getLeft() != null) {
			vSum(t.getLeft(), hm, c - 1);
		}
		if (t.getRight() != null) {
			vSum(t.getRight(), hm, c + 1);
		}
	}

}
