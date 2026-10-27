
import java.util.ArrayDeque;
import java.util.Deque;

public class Mixed150{
    public int numIslands(char[][] grid) {
    // Your solution
        boolean visit[][] = new boolean [grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!visit[i][j] && grid[i][j]=='1'){
                    count++;
                    bfs(grid,visit,i,j);
                }
            }
        }
        return count;
    }
    public static void bfs(char[][]grid,boolean visit[][], int r,int c){
        Deque<int[]>queue = new ArrayDeque<>();
        visit[r][c]=true;
        int direct[][] = {{0,1},{0,-1},{-1,0},{1,0}};
        queue.offer(new int[] {r,c});
        while(!queue.isEmpty()){
            int current[] = queue.poll();
            int currRow = current[0];
            int currCol = current[1];
            for(int dir[]:direct){
                int nextRow = currRow + dir[0];
                int nextCol = currCol + dir[1];
                if(nextRow>=0 && nextRow<grid.length && nextCol>=0 && nextCol<grid[0].length){
                    if(!visit[nextRow][nextCol] && grid[nextRow][nextCol]=='1'){
                        visit[nextRow][nextCol]=true;
                        queue.offer(new int[] {nextRow,nextCol});
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Mixed150 solution = new Mixed150();

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

        System.out.println(solution.numIslands(grid1)); // Expected: 1
        System.out.println(solution.numIslands(grid2)); // Expected: 3
    }
}
