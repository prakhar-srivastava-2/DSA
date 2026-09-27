import java.util.HashMap;

public class Mixed67 {

    public static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 exists before the array starts
        map.put(0, -1);

        int sum = 0;
        int maxL = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            // Same prefix sum means equal number of 0s and 1s
            if (map.containsKey(sum)) {

                int len = i - map.get(sum);

                maxL = Math.max(maxL, len);

            } else {

                // Store only the earliest occurrence
                map.put(sum, i);
            }
        }

        return maxL;
    }

    public static void main(String[] args) {

        int nums[] = {0, 1, 0, 0, 1, 1, 0};

        System.out.println(findMaxLength(nums));
    }
}