
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class UndirectedTraversal{
    public static boolean hasCycle(int V, int[][] edges){
        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(graph,i,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean bfs(List<List<Integer>>graph,int start,boolean visited[]){
        visited[start]=true;
        Deque<int[]>queue = new ArrayDeque<>();
        queue.offer(new int[] {start,-1});
        while(!queue.isEmpty()){
            int curr[] = queue.poll();
            int current = curr[0];
            int parent = curr[1];
            for(int i=0;i<graph.get(current).size();i++){
                int neigbor = graph.get(current).get(i);
                if(!visited[neigbor]){
                    visited[neigbor] = true;
                    queue.offer(new int[] {neigbor,current});
                }
                else if(neigbor!=parent){
                        return true;
                    }
            }
        }
        return false;

    }
}