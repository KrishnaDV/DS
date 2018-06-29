public class RangePrinterBst {

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

		rangePrint(t,6,10);

	}

	private static void rangePrint(Tree t, int i, int j) {

		if (t == null) {

			return;

		}

		rangePrint(t.getLeft(),i,j);
		
		if (t.getData()>=i && t.getData()<=j) {

			System.out.print(t.getData()+" ");

		}

		rangePrint(t.getRight(),i,j);
		
	}
}
