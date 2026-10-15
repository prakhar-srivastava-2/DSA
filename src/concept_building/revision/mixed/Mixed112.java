
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed112{
    public int countComponents(int n, int[][] edges){
        List<List<Integer>>graph = new ArrayList<>();
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(graph,i,visited);
            }
        }
        return count;
    }
    public static void bfs(List<List<Integer>>graph,int start,boolean visited[]){
        Deque<Integer>queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.offer(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        Mixed112 solution = new Mixed112();

        // int n = 5;
        // int[][] edges = {
        //     {0, 1},
        //     {1, 2},
        //     {3, 4}
        // };
        int n = 4;
        int[][] edges = {{0, 1}};

        int result = solution.countComponents(n, edges);

        System.out.println("Number of connected components: " + result);
    }
}