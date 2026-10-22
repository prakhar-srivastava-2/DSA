public class Mixed134{
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int h = (m*n)-1;
        return binarySearch(matrix,target,l,h,n);
    }
    public static boolean binarySearch(int[][] matrix, int target,int l,int h, int n){
        if(l>h){
            return false;
        }
        int mid = l + (h-l)/2;
        int row = mid/n;
        int col = mid%n;
        if(matrix[row][col]==target){
            return true;
        }
        if(matrix[row][col]<target){
            return binarySearch(matrix, target, mid+1, h, n);
        }
        if(matrix[row][col]>target){
            return binarySearch(matrix, target, l, mid-1, n);
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        System.out.println(searchMatrix(matrix, 3));  // true
        System.out.println(searchMatrix(matrix, 13)); // false
    }
}