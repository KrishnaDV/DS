
public class PrintPathsRtoL {

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
		
		
		printPaths(t);
		
	}

	private static void printPaths(Tree t) {
		
		int[] path = new int[100];
		
		printpath(t,path,0,0);
		
		
	}

	private static void printpath(Tree t, int[] path, int i, int sum) {
		
		if(t == null){
			
			return;
			
		}
		
		
		path[i] = t.getData();
		
		sum = sum + path[i];
		
		i++;
		
		
		if(t.getLeft()==null&&t.getRight()==null){
			
			printarray(path,i,sum);
			
		}
		
		else{
			
			printpath(t.getLeft(),path,i,sum);
			
			printpath(t.getRight(),path,i,sum);
			
		}
		
		
	}

	private static void printarray(int[] path, int i, int sum) {
		
		
		
		
		for(int j=0;j<i;j++){
			
			System.out.print(path[j]+" ");
			
		}
		
		System.out.print("sum "+sum);
		
		System.out.println();
		
	}
	
	
}
