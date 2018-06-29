public class Ancestors {

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

		
		ancestors(t,t4);
		
		
	}

	private static void ancestors(Tree t, Tree t3) {
		
		int path[] = new int[100];
		
		ans(t,t3,path,0);
		
	}

	private static void ans(Tree t, Tree t3, int[] path, int i) {
		
		if(t == null || t == t3){
			
			return;
			
		}
		
		path[i] = t.getData();
		
		i++;
		
		if(t.getLeft()==t3 || t.getRight()==t3){
			
		printArray(path,i);	
			
		}
		
		ans(t.getLeft(),t3,path,i);
		
		ans(t.getRight(),t3,path,i);
		
		
	}

	private static void printArray(int[] path, int i) {
		
		
		for(int j=0;j<i;j++){
			
			System.out.println(path[j]);
			
		}
		
	}
}