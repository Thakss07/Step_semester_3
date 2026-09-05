import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        // HashMap stores:
        // prefix sum -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Empty prefix has sum 0
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            // Calculate current prefix sum
            currentSum += num;

            // We need an earlier prefix sum:
            // currentSum - k
            int requiredSum = currentSum - k;

            if (map.containsKey(requiredSum)) {

                // Add number of times required prefix occurred
                count += map.get(requiredSum);
            }

            // Store/update current prefix sum
            map.put(
                currentSum,
                map.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays: " + result);
    }
}
