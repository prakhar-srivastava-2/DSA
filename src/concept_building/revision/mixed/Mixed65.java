import java.util.HashSet;
import java.util.Set;

public class Mixed65 {

    public static int longestConsecutiveSequence(int nums[]) {

        Set<Integer> set = new HashSet<>();

        // Put all numbers into the set
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxCount = 0;

        // Check every number
        for (int i = 0; i < nums.length; i++) {

            // Start counting only if this is the
            // beginning of a sequence
            if (!set.contains(nums[i] - 1)) {

                int current = nums[i];
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int nums[] = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutiveSequence(nums));
    }
}