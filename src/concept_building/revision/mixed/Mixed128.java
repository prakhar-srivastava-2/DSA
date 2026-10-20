public class Mixed128{
    public static int minPathSum(int[][] grid){
        int t[][] = new int[grid.length+1][grid[0].length+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0 || j==0){
                    t[i][j] = Integer.MAX_VALUE-1;
                }
            }
        }
        t[1][1] = grid[0][0];
        for (int j = 2; j < t[0].length; j++) {
    t[1][j] = grid[0][j - 1] + t[1][j - 1];
}

// First column: can only come from above
for (int i = 2; i < t.length; i++) {
    t[i][1] = grid[i - 1][0] + t[i - 1][1];
}
        for(int i=2;i<t.length;i++){
            for(int j=2;j<t[i].length;j++){
                t[i][j] = Math.min(grid[i-1][j-1]+t[i-1][j],grid[i-1][j-1]+t[i][j-1]);
            }
        }
        return t[grid.length][grid[0].length];
    }
    public static void main(String[] args) {
        int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}