package org.example;

public class MoveZeros {
    public void moveZeros(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }

            fast++;
        }
    }


}
