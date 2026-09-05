import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // Find middle
            int mid = left + (right - left) / 2;

            // Compare middle with rightmost element
            if (nums[mid] > nums[right]) {

                // Minimum is on the right side
                left = mid + 1;

            } else {

                // Minimum is at mid or on the left side
                right = mid;
            }
        }

        // left == right
        // This position contains the minimum
        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        int result = findMin(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Minimum: " + result);
    }
}