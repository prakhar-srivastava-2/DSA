
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed154{
    public static void main(String[] args) {
        int n = 5;

        int[][] edges = {
            {0, 1},
            {1, 2},
            {3, 4}
        };

        System.out.println(countComponents(n, edges));
    }
    public static int countComponents(int n,int edges[][]){
        boolean visited[] = new boolean[n];
        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int count=0;
        for(int edge[]:edges){
            int u=edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(graph,visited,i);
            }
        }
        return count;
    }
    public static void bfs(List<List<Integer>>graph,boolean visited[],int start){
        Deque<Integer>queue = new ArrayDeque<>();
        visited[start] = true;
        queue.offer(start);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}