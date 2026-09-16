package org.example;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,
           max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
            }else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return Math.max(max, count);
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        // Test Case 1: Standard case with mixed 1s and 0s
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Test 1 Output: " + solution.findMaxConsecutiveOnes(nums1)); // Expected: 3

        // Test Case 2: Consecutive 1s at the very end
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Test 2 Output: " + solution.findMaxConsecutiveOnes(nums2)); // Expected: 2

        // Test Case 3: No 1s in the array
        int[] nums3 = {0, 0, 0};
        System.out.println("Test 3 Output: " + solution.findMaxConsecutiveOnes(nums3)); // Expected: 0
    }
}
