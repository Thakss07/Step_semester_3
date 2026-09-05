public class MaxSubarray {

    public static int maxSubArray(int[] nums) {

        // Start with the first element
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Start from the second element
        for (int i = 1; i < nums.length; i++) {

            // Decide whether to:
            // 1. Continue the existing subarray
            // 2. Start a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}