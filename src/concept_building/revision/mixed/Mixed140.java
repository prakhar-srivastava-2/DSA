
import java.util.ArrayDeque;
import java.util.Deque;

public class Mixed140{
    public int numIslands(char[][] grid){
        int count=0;
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    count++;
                    bfs(grid,visited,i,j);
                }
            }
        }
        return count;
    }
    public static void bfs(char[][]grid,boolean[][]visited,int r,int c){
        int direction[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        Deque<int[]>queue= new ArrayDeque<>();
        visited[r][c] = true;
        queue.offer(new int[] {r,c});
        while(!queue.isEmpty()){
            int current[]  = queue.poll();
            int currRow = current[0];
            int currCol = current[1];
            for(int dir[]:direction){
                int nextRow = currRow + dir[0];
                int nextCol = currCol + dir[1];
                if(nextRow>=0 && nextRow<grid.length && nextCol>=0 && nextCol<grid[0].length){
                    if(!visited[nextRow][nextCol] && grid[nextRow][nextCol]=='1'){
                        visited[nextRow][nextCol] = true;
                        queue.offer(new int[] {nextRow,nextCol});
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Mixed140 sol = new Mixed140();
        char grid[][] = {{'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}
                        };
        System.out.println(sol.numIslands(grid));
    }
}