
import java.util.ArrayList;
import java.util.List;

public class DirectedTraversal{
    public static boolean hasCycle(int V, int[][] edges){
        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u  =edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
        }
        boolean visited[] = new boolean[V];
        boolean pathTravelled[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && !pathTravelled[i]){
                if(dfs(graph,i,visited,pathTravelled)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(List<List<Integer>>graph,int start,boolean visited[], boolean pathTravelled[]){
        visited[start] = true;
        pathTravelled[start] = true;
        for(int i=0;i<graph.get(start).size();i++){
            int neighbor = graph.get(start).get(i);
            if(!visited[neighbor]){
                if(dfs(graph,neighbor,visited,pathTravelled)){
                    return true;
                }
            }
            else if(pathTravelled[neighbor]){
                return true;
            }

        }
        pathTravelled[start] = false;
        return false;
    }

}