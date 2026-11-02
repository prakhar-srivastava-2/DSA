
import java.util.Arrays;

public class Mixed158 {

    public static int lengthOfLIS(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        int maxLen = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {

                    dp[i] = Math.max(
                        dp[i],
                        1 + dp[j]
                    );
                }
            }

            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        System.out.println(lengthOfLIS(nums));
    }
}
