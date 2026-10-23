
import java.util.ArrayDeque;
import java.util.Deque;

public class Mixed136{
    public int findCircleNum(int[][] isConnected){
        int count=0;
        boolean visited[][] = new boolean[isConnected.length][isConnected[0].length];
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(!visited[i][j] && isConnected[i][j]==1){
                    count++;
                    bfs(isConnected,visited,i,j);
                }
            }
        }
        return count;
    }
    public static void bfs(int[][] isConnected,boolean [][] visited,int row,int col){
        Deque<int[]>queue = new ArrayDeque<>();
        visited[row][col]=true;
        queue.offer(new int[] {row,col});
        int dirs[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
            int current[] = queue.poll();
            int currRow = current[0];
            int currCol = current[1];
            for(int dir[]:dirs){
                int nextRow = currRow+dir[0];
                int nextCol = currCol + dir[1];
                if(nextRow>=0 && nextRow<isConnected.length && nextCol>=0 && nextCol<isConnected[0].length){
                    if(!visited[nextRow][nextCol] && isConnected[nextRow][nextCol]==1){
                        visited[nextRow][nextCol]=true;
                        queue.offer(new int[] {nextRow,nextCol});
                    }
                }

            }

        }
    }
    public static void main(String[] args) {
        Mixed136 sol = new Mixed136();
        int[][] isConnected = {
    {1, 0, 1},
    {0, 1, 0},
    {1, 0, 1}
};

        int result = sol.findCircleNum(isConnected);

        System.out.println("Number of provinces: " + result);
    }
}