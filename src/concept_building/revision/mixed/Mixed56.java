
// import java.util.ArrayDeque;
// import java.util.Deque;

// public class Mixed56{
//     public static int findCircleNum(int[][] isConnected){
//         boolean visited[][] = new boolean[isConnected.length][isConnected.length];
//         int p = 0;
//         for(int row = 0;row<isConnected.length;row++){
//             for(int col=0;col<isConnected[row].length;col++){
//                 if(!visited[row][col]){
//                     p+=bfs(isConnected,row,col,visited);
//                 }
//             }
//         }
//         return p;
//     }

//     public static int bfs(int isConnected[][],int row, int col, boolean visited[][]){
//         Deque<int[]>queue = new ArrayDeque<>();
//         visited[row][col] = true;
//         queue.offer(new int[]{row,col});
//         int dir[][] = {{0,1},{0,-1},{-1,0},{1,0}};
//         int count = 0;

//         while(!queue.isEmpty()){
//             int current[] = queue.poll();
//             int currRow = current[0];
//             int currCol = current[1];
//             for(int i=0;i<dir.length;i++){
//                 int newRow = currRow + dir[i][0];
//                 int newCol = currCol + dir[i][1];
//                 if(newRow>=0 && newRow<dir.length && newCol>=0 && newCol<dir[0].length){
//                     // int neighbour = isConnected[newRow][newCol];
//                     if(!visited[newRow][newCol]){
//                         visited[newRow][newCol]=true;
//                         if(isConnected[newRow][newCol]==0 && newRow!=newCol){
//                             count++;
//                         }
//                         queue.offer(new int[]{newRow,newCol});

//                     }
//                 }

//             }
//         }
//         return count;
//     }
// }

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Mixed56 {

    public static int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        // Step 1: Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Step 2: Convert adjacency matrix → adjacency list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (isConnected[i][j] == 1 && i != j) {
                    graph.get(i).add(j);
                }
            }
        }

        // Step 3: Count connected components using BFS
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                provinces++;

                bfs(graph, i, visited);
            }
        }

        return provinces;
    }

    public static void bfs(
            List<List<Integer>> graph,
            int start,
            boolean[] visited) {

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {

            int curr = queue.poll();

            for (int i = 0; i < graph.get(curr).size(); i++) {

                int neighbour = graph.get(curr).get(i);

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }
}