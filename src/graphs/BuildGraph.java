
import java.util.ArrayList;
import java.util.List;

public class BuildGraph{
    public static List<List<Integer>> buildGraph(int n, int[][] edges){
        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
}