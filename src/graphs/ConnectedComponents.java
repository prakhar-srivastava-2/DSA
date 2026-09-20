
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ConnectedComponents{
    public static void main(String[] args) {

    int n = 5;

    int[][] edges = {
        {0, 1},
        {1, 2},
        {3, 4}
    };

    int result = countComponents(n, edges);

    System.out.println(result);
}

    public static int countComponents(int n, int[][]edges){
        //create adjancy matrix
        List<List<Integer>>adjancy = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjancy.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjancy.get(u).add(v);
            adjancy.get(v).add(u);
        }

        //use adjancy matrix and start a counter
        boolean visited[] = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(adjancy,i,visited);
            }
        }
        return count;
    }

    public static void bfs(List<List<Integer>>graph,int start, boolean visited[]){
        Deque<Integer>queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start]=true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            visited[curr] = true;
            for(int i=0;i<graph.get(curr).size();i++){
                int neighbour = graph.get(curr).get(i);
                if(!visited[neighbour]){
                    queue.offer(neighbour);
                }
            }
        }
    }
}