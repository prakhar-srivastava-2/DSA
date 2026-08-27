import java.util.ArrayList;
import java.util.List;

public class AverageOfSubarrays{
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k =5;
        int sum=0;
        List<Double>res = new ArrayList<>();
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        double avg = (double) sum/k;
        res.add(avg);

        for (int i = k;i<arr.length;i++){
            sum = sum - arr[i-k]+arr[i];
            avg = (double) sum/k;
            res.add(avg);
        }
        System.out.println(res);
    }
}