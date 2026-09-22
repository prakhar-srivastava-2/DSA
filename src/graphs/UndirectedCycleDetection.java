
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class UndirectedCycleDetection{
    public static boolean hasCycle(int V, int[][] edges){
        //create adjancy matrix;
        List<List<Integer>>adjancy = new ArrayList<>();
        for(int i=0;i<V;i++){
            adjancy.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjancy.get(u).add(v);
            adjancy.get(v).add(u);

        }
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(adjancy,visited,i)){
                    return true;
                }
            }
        }


        return false;
    }

    public static boolean bfs(List<List<Integer>>graph,boolean visited[],int start){
        Deque<int[]>queue = new ArrayDeque<>();
        queue.offer(new int[]{start,-1});
        visited[start]=true;
        while(!queue.isEmpty()){
            int currElement[] = queue.poll();
            int curr = currElement[0];
            int parent = currElement[1];
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbour = graph.get(curr).get(i);
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.offer(new int[]{neighbour,curr});
                }
                else if(neighbour!=parent){
                    return true;
                }
            }
        }
        return false;
    }
}