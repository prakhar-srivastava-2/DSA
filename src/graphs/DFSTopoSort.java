
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DFSTopoSort{
    public static List<Integer> topoSort(int V, int edges[][]){
        List<Integer>result = new ArrayList<>();
        List<List<Integer>>graph = new ArrayList<>();
        int state[] = new int[V];
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
        }
        for(int i=0;i<V;i++){
            if(state[i]==0){
                boolean c = dfs(i,graph,state,result);
                if(c){
                    return new ArrayList<>();
                }
            }
        }
        Collections.reverse(result);
        return result;

    }

    public static boolean dfs(
        int node,
        List<List<Integer>> graph,
        int[] state,
        List<Integer> result) {

    // your code
        state[node] = 1;
        for(int i=0;i<graph.get(node).size();i++){
            int neighbor = graph.get(node).get(i);
            if(state[neighbor]==0){
            if (dfs(neighbor,graph,state,result)){
                return true;
            }
            else if(state[neighbor]==1){
                return true;
            }
            }

        }
        state[node]=2;
        result.add(node);
        return false;

}

public static void main(String[] args) {

    int V = 4;

    int[][] edges = {
        {0, 1},
        {0, 2},
        {1, 3},
        {2, 3}
    };

    List<Integer> result = topoSort(V, edges);

    System.out.println(result);
}
}