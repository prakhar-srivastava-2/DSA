
import java.util.Arrays;

public class MergeSortedArrays{
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;

        int nums2[] = {2,5,6};
        int n = 3;
        int k = m+n-1;
        int i = nums1.length - m -1;
        int j = nums2.length-1;

        while(i>=0 &&j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }
            else{
                nums1[k] = nums1[i];
                i--;

            }
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}