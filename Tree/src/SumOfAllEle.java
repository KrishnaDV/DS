
public class SumOfAllEle {

	public static void main(String[] args) {
		
		Tree t = new Tree(11);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		Tree t3 = new Tree(22);

		Tree t4 = new Tree(3);

		Tree t5 = new Tree(45);
		
		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);
		
		t3.setLeft(t5);
		
		//t4.setLeft(t5);
		
		int res = sumAll(t);
		
		System.out.println(res);
	}

	private static int sumAll(Tree t) {
		
		if(t == null){
		
		return 0;
	}
		
		return t.getData()+sumAll(t.getLeft())+sumAll(t.getRight());
		
		
	}
	
}
