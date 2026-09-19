
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BFS{
    public static void bfs(List<List<Integer>> graph, int start){
        Deque<Integer>queue = new ArrayDeque<>();
        boolean visited[] = new boolean[graph.size()];
        queue.offer(start);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            visited[curr]=true;
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbour = graph.get(curr).get(i);
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }



    }
}