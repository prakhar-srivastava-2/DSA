
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BFS{
    public static void bfs(List<List<Integer>> graph, int start){
        boolean visited[] = new boolean[graph.size()];
        Deque<Integer>queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start]=true;
        while (!queue.isEmpty()){
            int curr = queue.poll();
            System.out.println(curr);
            // int u = graph.get(curr).get(0);
            // int v = graph.get(curr).get(1);
            // if(visited[u]!=true && visited[v]!=true){
            //     queue.offer(u);
            //     queue.offer(v);
            //     visited[u]=true;
            //     visited[v] = true;
            // }
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbour = graph.get(curr).get(i);
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

    int n = 5;

    int[][] edges = {
        {0, 1},
        {0, 2},
        {1, 3},
        {2, 4}
    };

    List<List<Integer>> graph = new ArrayList<>();

    // Build adjacency list
    for(int i = 0; i < n; i++){
        graph.add(new ArrayList<>());
    }

    for(int i = 0; i < edges.length; i++){
        int u = edges[i][0];
        int v = edges[i][1];

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // BFS starting from node 0
    bfs(graph, 0);
}
}