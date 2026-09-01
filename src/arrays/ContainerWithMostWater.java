public class ContainerWithMostWater{
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        //op=>49
        int i=0;
        int maxArea = 0;
        int j=height.length-1;
        while(i<j){
            int area = Integer.min(height[i],height[j])*(j-i);
            maxArea = Integer.max(area,maxArea);
            if(height[i]<height[j]){
            i++;
            }
            else{
            j--;
            }
        }
        System.out.println(maxArea);
    }
}