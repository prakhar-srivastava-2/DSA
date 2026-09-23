
import java.util.ArrayDeque;
import java.util.Deque;

public class NumIsland{
    public static int numIslands(int[][] grid){
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int count=0;
        for(int row = 0;row<grid.length;row++){
            for(int col = 0;col<grid[row].length;col++){
                if(!visited[row][col] && grid[row][col]==1){
                    count++;
                    bfs(grid,row,col,visited);
                }
            }
        }
        return count;
    }

    public static void bfs(int grid[][],int row,int col,boolean visited[][]){
        Deque<int[]>queue = new ArrayDeque<>();
        visited[row][col] = true;
        queue.offer(new int[] {row,col});
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int curr[] = queue.poll();
            int currRow = curr[0];
            int currCol = curr[1];
            for(int i=0;i<dir.length;i++){
                int newRow = currRow + dir[i][0];
                int newCol = currCol + dir[i][1];

                if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length){
                    if(!visited[newRow][newCol]){
                        visited[newRow][newCol] = true;
                        if(grid[newRow][newCol] == 1){
                            queue.offer(new int[] {newRow,newCol});
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    int[][] grid = {
        {1, 1, 0, 0, 0},
        {1, 1, 0, 1, 1},
        {0, 0, 0, 1, 0},
        {0, 0, 0, 0, 0},
        {1, 0, 1, 0, 1}
    };

    int result = numIslands(grid);

    System.out.println("Number of Islands: " + result);
}
}