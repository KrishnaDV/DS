public class checkPath {

	public static void main(String[] args) {

		Tree t = new Tree(1);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(3);

		Tree t3 = new Tree(4);

		Tree t4 = new Tree(5);

		Tree t5 = new Tree(6);

		t.setLeft(t1);

		t.setRight(t2);

		t1.setLeft(t3);

		t1.setRight(t4);

		t2.setLeft(t5);
		
		boolean res = checkPath(t,8);
		
		System.out.println(res);
		
	}

	private static boolean checkPath(Tree t, int sum) {
		
		if(t == null){
			
			return false;
			
		}
		
		if(t.getLeft()==null&&t.getRight()==null&&t.getData()==sum){
			
			return true;
			
		}
		
		if(t.getLeft()!=null&&t.getData()==sum ||t.getRight()!=null&&t.getData()==sum){
			
			return true;
			
		}
		
		
		return checkPath(t.getLeft(),sum-t.getData()) || checkPath(t.getRight(),sum-t.getData()) ;
	
		
		
	}

}
