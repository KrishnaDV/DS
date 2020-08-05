
public class LcaBst {
	public static void main(String[] args){
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
		
	    Tree res = lcaBst(t,8,22);
	    System.out.println(res);
	}

	private static Tree lcaBst(Tree t, int i, int j) {
		if(t == null){
			return t;
		}
		// i<t.data && j<t.data
		if(i<t.getData() && j<t.getData()){
			return lcaBst(t.getLeft(),i,j);
		}
		//i>t.getData && j>t.getData
		if(i>t.getData() && j>t.getData()){
			return lcaBst(t.getRight(),i,j);
		}
		// i < t.getData <j
		return t;
	}
}
