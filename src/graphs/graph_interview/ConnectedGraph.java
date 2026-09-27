
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ConnectedGraph{
    public static int countConnectedComponents(int n, int[][] edges) {
        List<List<Integer>>graph = new ArrayList<>();
        boolean visit[] = new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i=0;i<n;i++){
            if(!visit[i]){
                count++;
                bfs(graph,i,visit);
            }
        }
        return count;
    }
    public static void bfs(List<List<Integer>> graph,int start,boolean visit[]){
        Deque<Integer>queue = new ArrayDeque<>();
        visit[start] = true;
        queue.offer(start);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                if(!visit[neighbor]){
                    visit[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {

        int n = 5;

        int[][] edges = {
            {0, 1},
            {1, 2},
            {3, 4}
        };

        System.out.println(countConnectedComponents(n, edges));
    }
}