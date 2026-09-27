import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelay {

    public static int networkDelayTime(int[][] times, int n, int k) {

        // Build adjacency list
        // Nodes are 1 to n, so create n + 1 slots
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edges : times) {

            int u = edges[0];
            int v = edges[1];
            int w = edges[2];

            graph.get(u).add(new int[]{v, w});
        }

        // Shortest distance from k to every node
        int dir[] = new int[n + 1];
        Arrays.fill(dir, Integer.MAX_VALUE);

        PriorityQueue<int[]> heap =
                new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        dir[k] = 0;
        heap.offer(new int[]{k, 0});

        // Dijkstra
        while (!heap.isEmpty()) {

            int current[] = heap.poll();

            int curr = current[0];
            int weight = current[1];

            // Ignore stale entry
            if (weight > dir[curr]) {
                continue;
            }

            for (int i = 0; i < graph.get(curr).size(); i++) {

                int neighbor[] = graph.get(curr).get(i);

                int nextNode = neighbor[0];
                int nextWeight = neighbor[1];

                if (dir[curr] + nextWeight < dir[nextNode]) {

                    dir[nextNode] = dir[curr] + nextWeight;

                    heap.offer(new int[]{
                        nextNode,
                        dir[nextNode]
                    });
                }
            }
        }

        // Find the time taken by the last reachable node
        int maxTime = 0;

        for (int i = 1; i <= n; i++) {

            // Some node cannot be reached
            if (dir[i] == Integer.MAX_VALUE) {
                return -1;
            }

            maxTime = Math.max(maxTime, dir[i]);
        }

        return maxTime;
    }

    public static void main(String[] args) {

        int n = 4;

        int[][] times = {
            {2, 1, 1},
            {2, 3, 1},
            {3, 4, 1}
        };

        int k = 2;

        System.out.println(networkDelayTime(times, n, k));
    }
}