
import java.util.List;

public class DFS{
    public static void dfs(List<List<Integer>> graph, int start){
        boolean visited[] = new boolean[graph.size()];
        for(int i=0;i<graph.size();i++){
            if(!visited[i]){
                dfsLoop(graph,i,visited);
            }
        }
    }

    public static void dfsLoop(List<List<Integer>> graph, int start, boolean visited[]){
        visited[start] = true;
        System.out.println(start);
        for(int i=0;i<graph.get(start).size();i++){
            int neighbor = graph.get(start).get(i);
            if(!visited[neighbor]){
                dfsLoop(graph, neighbor, visited);
            }
        }
    }
}