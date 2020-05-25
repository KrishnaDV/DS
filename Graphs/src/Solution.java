
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	//Bfs that stores Distance from source, predecessor of each node from parent.
	public static BfsInfo[] doBFS(int[][] graph, int source) {
		System.out.println(graph.length);
		BfsInfo[] bfsInfo = new BfsInfo[graph.length];

		bfsInfo[source] = new BfsInfo();
		bfsInfo[source].distance = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(source);

		int distance = 1;
		while (!q.isEmpty()) {
			boolean visited = true;
			int curr = q.poll();
			int a[] = graph[curr];
			for (int i = 0; i < a.length; i++) {
				int ele = a[i];
				if (null == bfsInfo[ele]) {
					visited = false;
					q.add(ele);
					bfsInfo[ele] = new BfsInfo();
					bfsInfo[ele].distance = distance;
					bfsInfo[ele].predecessor = curr;
				}
			}
			if (!visited) {
				distance += 1;
			}
		}

		return bfsInfo;
	}
}
