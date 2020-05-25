public class BfsTest {
	public static void main(String[] args) {
		int graph[][] = { { 1 }, { 0, 4, 5 }, { 3, 4, 5 }, { 2, 6 }, { 1, 2 }, { 1, 2, 6 }, { 3, 5 }, {} };
		int source = 3;
		BfsInfo[] result = Solution.doBFS(graph, source);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i].distance+" "+result[i].predecessor);
		}

	}
}