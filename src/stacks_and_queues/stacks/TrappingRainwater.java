public class TrappingRainwater{
    public static int trap(int[] height){
        //height = [{0,1,0,2,1,0,1,3,2,1,2,1}]
        //op =>> 6
        int sum = 0;

        for(int k = 1;k<height.length-1;k++){
            int i=0;
            int j=height.length-1;
            int left = 0;
            int right = 0;
            while(i<k){
            left = Math.max(left,height[i]);
            i++;}
            while(j>k){
            right = Math.max(right,height[j]);
            j--;}
            sum+=Math.max(0,Math.min(left,right) - height[k]);

        }
        return sum;
    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}