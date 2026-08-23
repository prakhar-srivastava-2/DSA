
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        // optimum for sorted array
//         int arr[] = {1,2,3,4,5};
//         int sum = 8;
// // {1,2,4,3,5,0,7,-1} 1
//         int i=0;
//         int j = arr.length - 1;
//         while (i<j){
//             if (arr[i]+arr[j]==sum){
//                 System.out.printf(i+" "+j);
//                 break;
//             }
//             else if(arr[i] + arr[j] < sum){
//                 i++;
//             }
//             else{
//                 j--;
//             }
//         }

        HashMap<Integer, Integer> result = new HashMap<>();
        int arr[] = {3,2,4};
        int sum=6;
        for(int i=0;i<arr.length;i++){
            int target = sum - arr[i];
            if(result.containsKey(target)){
                System.out.println(result.get(target)+" "+i);
            }
            else{
                result.put(arr[i],i);
            }
        }

    }
}