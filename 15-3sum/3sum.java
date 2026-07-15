import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Result list to store all unique triplets
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array to make duplicate handling easier
        Arrays.sort(nums);

        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for 'i' to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two-pointer approach: left starts after i, right starts at the end
            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Find pairs such that nums[i] + nums[left] + nums[right] == 0
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    // If sum is too small, move left pointer to increase sum
                    left++;
                } else {
                    // If sum is too large, move right pointer to decrease sum
                    right--;
                }
            }
        }

        return result;
    }
}
