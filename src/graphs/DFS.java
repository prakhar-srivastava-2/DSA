
import java.util.List;

public class DFS{
    public static void dfs(List<List<Integer>> graph, int start){
        boolean visited[] = new boolean[graph.size()];
        dfsHelper(graph,start,visited);
    }

    public static void dfsHelper(List<List<Integer>> graph, int curr, boolean[] visited){
        visited[curr] = true;
        System.out.println(curr);
        for(int i=0;i<graph.get(curr).size();i++){
            int neighbour = graph.get(curr).get(i);
            if(!visited[neighbour]){
                dfsHelper(graph, neighbour, visited);
            }
        }
    }

}