public class MinEleInTree {

	public static void main(String[] args) {
		
		Tree t = new Tree(11);

		Tree t1 = new Tree(2);

		Tree t2 = new Tree(31);

		t.setLeft(t1);

		t.setRight(t2);

		System.out.println(t);
	
		int res = minEle(t);
		
		System.out.println(res);
		
	}

	private static int minEle(Tree t) {
		
		int min = Integer.MAX_VALUE;
		
		if(t!=null){
			
			int leftMin = minEle(t.getLeft());
			
			int rightMin = minEle(t.getRight());
			
			if(leftMin < rightMin){
				
				min = leftMin;
				
			}
			
			else{
				
				min = rightMin;
				
			}
			
			if(t.getData() < min){
				
				min = t.getData();
				
			}
			
		}
		
		return min;
	}
	
}
