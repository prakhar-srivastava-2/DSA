
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed80{
    public static void main(String[] args) {

        int n = 6;

        int[][] edges = {
            {0, 1},
            {0, 2},
            {3, 5},
            {5, 4},
            {4, 3}
        };

        int source = 0;
        int destination = 5;

        boolean result = validPath(n, edges, source, destination);

        System.out.println(result);
    }

    public static boolean validPath(int n, int edges[][],int source, int dest){
        if(source==dest){
            return true;
        }

        List<List<Integer>>graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean visited[] = new boolean[n];

        Deque<Integer>queue = new ArrayDeque<>();
        visited[source] = true;
        queue.offer(source);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    if(neighbor == dest){
                        return true;
                    }
                    queue.offer(neighbor);
                }
            }
        }
        return false;
    }
}