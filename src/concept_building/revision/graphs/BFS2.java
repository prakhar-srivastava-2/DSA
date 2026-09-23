
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BFS2{
    public static void bfs(List<List<Integer>> graph, int start){
        Deque<Integer>queue = new ArrayDeque<>();
        boolean visited[] = new boolean[graph.size()];
        visited[start] = true;
        queue.offer(start);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.println(curr);
            for(int i=0;i<graph.get(curr).size();i++){
                int neigbor = graph.get(curr).get(i);
                if(!visited[neigbor]){
                    visited[neigbor] = true;
                    queue.offer(neigbor);
                }
            }
        }
    }
}