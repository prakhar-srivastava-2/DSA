public class TrappingRainwater3{
    public static int trap(int[] height){
        int left = 0;
        int right = height.length-1;
        int sum=0;
        int rightMax = 0;
        int leftMax = 0;
        while(left<right){
            if(height[left]<=height[right]){
                leftMax = Math.max(leftMax,height[left]);
                sum+=leftMax -height[left];
                left++;
            }
            else{
                rightMax = Math.max(rightMax,height[right]);
                sum+=rightMax-height[right];
                right--;
            }

        }
        return sum;
}

public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}