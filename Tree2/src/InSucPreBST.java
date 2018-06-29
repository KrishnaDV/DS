public class InSucPreBST {

	private static int pre,succ;

	public static void main(String[] args) {

		Tree t = new Tree(50);

		Tree t1 = new Tree(30);

		Tree t2 = new Tree(70);

		Tree t3 = new Tree(20);

		Tree t4 = new Tree(40);

		Tree t5 = new Tree(60);

		Tree t6 = new Tree(70);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);

		t2.setLeft(t5);

		t2.setRight(t6);

		inSucPre(t, 20);
		
		System.out.println("Pre "+pre+" Succ"+succ);

	}

	private static void inSucPre(Tree t, int i) {


		if (t != null) {

			if (t.getData() == i) {

				if (t.getLeft() != null) {

					Tree tmp = t.getLeft();

					while (!(tmp.getRight() == null)) {

						tmp = tmp.getRight();

					}

					pre = tmp.getData();
				}
				if (t.getRight() != null) {

					Tree tmp = t.getRight();

					while (!(tmp.getLeft() == null)) {

						tmp = tmp.getLeft();

					}

					succ = tmp.getData();
				}

				return;
				
			}

			else if (i < t.getData()) {

				succ = t.getData();

				inSucPre(t.getLeft(), i);

			}

			else if(i > t.getData()){

				pre = t.getData();

				inSucPre(t.getRight(), i);

			}

		}
	}
}