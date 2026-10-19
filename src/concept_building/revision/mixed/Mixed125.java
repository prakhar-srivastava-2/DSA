public class Mixed125{
    public static int uniquePath(int grid[][]){
        int t[][] = new int[grid.length+1][grid[0].length+1];
        if(grid[0][0]==0){
            t[1][1]=1;
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(i==1 && j==1){
                    continue;
                }
                if(grid[i-1][j-1]==1){
                    t[i][j] = 0;
                }
                else{
                    t[i][j] = t[i-1][j] + t[i][j-1];
                }
            }
        }
        return t[grid.length][grid[0].length];
    }
    public static void main(String[] args) {
        int grid[][]={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePath(grid));
    }
}