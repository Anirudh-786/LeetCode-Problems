package org.example;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums){
    int n = nums.length;
    int l = 0,
        r = nums.length - 1;

    int[] result = new int[n];

    for(int i = n - 1; i >= 0; i--) {
        int val;

        if(Math.abs(nums[l]) > Math.abs(nums[r])) {
            val = nums[l];
            l++;
        } else {
            val = nums[r];
            r--;
        }
        result[i] = val * val;
    }


        return result;
    }

    static void main() {
        SquaresOfSortedArray sortedSquares = new SquaresOfSortedArray();

        int [] nums = {-4,-1,0, 3, 10};
        System.out.println("Original Array: " + Arrays.toString(nums));

        int [] output = sortedSquares.sortedSquares(nums);
        System.out.println(("sorted squares: " + Arrays.toString(output)));
    }
}
