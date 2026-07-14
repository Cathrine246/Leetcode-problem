// LeetCode-style solution: class name must be Solution
// Problem: Find the duplicate number in an array using Floyd's cycle detection
// Constraints: Do not modify the array, use constant extra space

class Solution {
    public int findDuplicate(int[] nums) {
        // Step 1: Initialize two pointers (tortoise and hare)
        int tortoise = nums[0];
        int hare = nums[0];

        // Phase 1: Detect cycle
        do {
            tortoise = nums[tortoise];      // move by 1 step
            hare = nums[nums[hare]];        // move by 2 steps
        } while (tortoise != hare);

        // Phase 2: Find the entrance to the cycle (duplicate number)
        tortoise = nums[0];                 // reset tortoise to start
        while (tortoise != hare) {
            tortoise = nums[tortoise];      // move by 1 step
            hare = nums[hare];              // move by 1 step
        }

        // The meeting point is the duplicate number
        return hare;
    }
}
