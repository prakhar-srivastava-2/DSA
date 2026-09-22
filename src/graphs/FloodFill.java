
import java.util.ArrayDeque;
import java.util.Deque;

public class FloodFill{
    public static int[][] floodFill(int[][] image,int sr,int sc,int newColor){
        boolean visited[][] = new boolean[image.length][image[0].length];
        int originalColor = image[sr][sc];
        if(originalColor == newColor){
            return image;
        }

        bfs(image,visited,sr,sc,newColor,originalColor);
        return image;
    }

    public static void bfs(int[][]image,boolean [][] visited,int row,int col,int newColor,int originalColor){
        Deque<int[]>queue = new ArrayDeque<>();
        visited[row][col] = true;
        queue.offer(new int[] {row,col});
        int dir[][] = {{0,-1},{-1,0},{0,1},{1,0}};
        while(!queue.isEmpty()){
            int curr[] = queue.poll();
            int  currRow = curr[0];
            int currCol = curr[1];
            image[currRow][currCol]=newColor;
            for(int i=0;i<dir.length;i++){
                int newRow = dir[i][0]+currRow;
                int newCol = dir[i][1]+currCol;
                if(newRow>=0 && newRow<image.length && newCol>=0 && newCol<image[0].length){

                    if(image[newRow][newCol]==originalColor && !visited[newRow][newCol]){
                        visited[newRow][newCol] = true;
                        image[newRow][newCol] = newColor;
                        queue.offer(new int[]{newRow,newCol});
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

    int[][] image = {
        {1, 1, 1},
        {1, 1, 0},
        {1, 0, 1}
    };

    int sr = 1;
    int sc = 1;
    int newColor = 2;

    int[][] result = floodFill(image, sr, sc, newColor);

    for(int row = 0; row < result.length; row++){
        for(int col = 0; col < result[row].length; col++){
            System.out.print(result[row][col] + " ");
        }
        System.out.println();
    }
}
}