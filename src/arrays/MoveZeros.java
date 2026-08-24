
import java.util.Arrays;

public class MoveZeros{
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        if (arr.length <=1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int i = 0;
        int j = i+1;
        int len = arr.length;
        while (i<j && j<len){
            if(arr[i]==0 && arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            else if(arr[j]==0){
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}