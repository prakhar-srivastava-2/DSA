
import java.util.ArrayList;
import java.util.List;

public class CycleDetectionInDirectedGraph{
    public static boolean hasCycle(int V, int[][] edges) {
        //adjancy matrix
        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
        }
        boolean visited[] = new boolean[V];
        boolean hasPath[] = new boolean[visited.length];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(graph,i,visited,hasPath)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(List<List<Integer>> graph,int start,boolean visited[],boolean hasPath[]){

        visited[start] = true;
        hasPath[start] = true;
        for(int i=0;i<graph.get(start).size();i++){
            int neighbour = graph.get(start).get(i);
            if(!visited[neighbour]){
                if(dfs(graph,neighbour,visited,hasPath)){
                    return true;
                }
            }
            else if(hasPath[neighbour]){
                return true;
            }
        }
        hasPath[start] = false;
        return false;
    }

}