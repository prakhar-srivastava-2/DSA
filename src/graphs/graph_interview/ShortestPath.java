
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class ShortestPath{
    public static int shortestPath(int n, int[][] edges, int src, int dest) {
        if(src==dest){
            return 0;
        }
        List<List<Integer>>graph  =new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int dir[] = new int[n];
        Arrays.fill(dir,-1);
        dir[src] = 0;
        boolean visited[] = new boolean[n];
        Deque<Integer>queue = new ArrayDeque<>();
        visited[src] = true;
        queue.offer(src);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbor = graph.get(curr).get(i);
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    dir[neighbor] = dir[curr]+1;
                    queue.offer(neighbor);
                }
            }
        }
    return dir[dest];

}

// public static void main(String[] args) {

//     int n = 6;

//     int[][] edges = {
//         {0, 1},
//         {0, 2},
//         {1, 3},
//         {2, 3},
//         {3, 4},
//         {4, 5}
//     };

//     int src = 0;
//     int dest = 5;

//     System.out.println(shortestPath(n, edges, src, dest));
// }

public static void main(String[] args) {

    int n = 5;

    int[][] edges = {
        {0, 1},
        {1, 2},
        {3, 4}
    };

    int src = 0;
    int dest = 4;

    System.out.println(shortestPath(n, edges, src, dest));
}
}