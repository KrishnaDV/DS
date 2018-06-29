
public class BFS {

	public static void main(String[] args) {
		
		Graph1 g = new Graph1(4);
		
		g.addEdge(0, 1);
		
		g.addEdge(0, 2);
		
		g.addEdge(1, 2);
		
		g.addEdge(2, 0);
		
		g.addEdge(2, 3);
		
		g.addEdge(3, 3);
		
		
		System.out.print("BFS ---->   ");
		
		g.BFS(2);
		
		
		
	}
	
}
