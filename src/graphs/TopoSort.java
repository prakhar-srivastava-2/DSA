
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TopoSort{
    public static List<Integer> topoSort(int V, int[][] edges){
        List<List<Integer>>graph = new ArrayList<>();
        List<Integer>result = new ArrayList<>();
        int indegree[] = new int[V];
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            indegree[v]++;
        }
        Deque<Integer>queue = new ArrayDeque<>();

        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int curr = queue.poll();
            result.add(curr);
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.offer(neighbor);
                }
            }
        }
        if(result.size()!=V){
            return new ArrayList<>();
        }
        return result;
    }
}