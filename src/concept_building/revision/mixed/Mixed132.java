
import java.util.ArrayDeque;
import java.util.Deque;

public class Mixed132{
    public static int numIslands(char[][] grid){
        int count=0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                if(!visited[r][c] && grid[r][c]=='1'){
                    count++;
                    bfs(grid,r,c,visited);
                }
            }
        }
        return count;
    }
    public static void bfs(char[][]grid,int row,int col,boolean[][]visited){
        Deque<int[]>queue = new ArrayDeque<>();
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        visited[row][col] = true;
        queue.offer(new int[] {row,col});
        while(!queue.isEmpty()){
            int current[] = queue.poll();
            int currRow = current[0];
            int currCol = current[1];
            for(int direction[]:dir){
                int nextRow = currRow + direction[0];
                int nextCol = currCol + direction[1];
                if(nextRow>=0 && nextRow<grid.length && nextCol>=0 && nextCol<grid[0].length){
                    if(!visited[nextRow][nextCol] && grid[nextRow][nextCol]=='1'){
                        visited[nextRow][nextCol]=true;
                        queue.offer(new int[] {nextRow,nextCol});
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid1)); // Expected: 1
        System.out.println(numIslands(grid2)); // Expected: 3
    }
}