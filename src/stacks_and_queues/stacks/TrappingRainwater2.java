

public class TrappingRainwater2{
    public static int trap(int[] height){
                //height = [{0,1,0,2,1,0,1,3,2,1,2,1}]
        //op =>> 6
        // Deque<Integer> left = new ArrayDeque<>();
        // Deque<Integer> right = new ArrayDeque<>();
        // int leftMax[] = new int[height.length];
        // int rightMax[] = new int[height.length];
        // int sum=0;

        // Arrays.fill(leftMax,0);
        // Arrays.fill(rightMax,0);
        // for(int i=0;i<height.length;i++){
        //     while(!left.isEmpty() && height[i]>height[left.peek()]){
        //         int index = left.pop();
        //         leftMax[index] = height[i];
        //     }
        //     left.push(i);
        // }

        // for(int i=0;i<height.length;i++){
        //     while(!right.isEmpty() && height[i]>height[right.peek()]){
        //         int index = right.pop();
        //         rightMax[index] = height[i];
        //     }
        //     right.push(i);
        // }
        // for(int i=0;i<height.length;i++){
        //     sum+=Math.max(0,Math.min(leftMax[i],rightMax[i]) - height[i]);
        // }
        // return sum;
        int sum=0;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int l = height[0];
        for(int i=0;i<height.length;i++){
            l = Math.max(l,height[i]);
            leftMax[i] = l;
        }

        int r = height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            r = Math.max(r,height[i]);
            rightMax[i] =r;
        }
        for(int i=0;i<height.length;i++){
            sum+=Math.max(0,Math.min(leftMax[i],rightMax[i]) - height[i]);
        }
        return sum;

    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}