
import java.util.Scanner;

public class PrefixSum{
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};
        int res[] = new int[nums.length];
        int sum=0;
        int n=3;
        Scanner sc = new Scanner(System.in);
        int op;

        /***
        L = 1, R = 3
        L = 0, R = 2
        L = 2, R = 4

        18
        12
        24
         */
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
        }

        while(n>0){
            int L= sc.nextInt();
            int R = sc.nextInt();

            if(L==0){
                op = res[R];
            }
            else{
                op = res[R] - res[L-1];
            }
            System.out.println(op);
            n--;
        }

    }
}