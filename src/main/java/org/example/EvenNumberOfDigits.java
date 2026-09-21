package org.example;

import java.util.Arrays;

public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int num: nums) {
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000) {
                evenCount++;
            }
        }

        return evenCount;
    }

    static void main() {
        EvenNumberOfDigits evenNumber = new EvenNumberOfDigits();
        int [] nums = {-4,-1,0, 3, 10};
        System.out.println("Original Array: " + Arrays.toString(nums));

        int count = evenNumber.findNumbers(nums);
        System.out.println("Even number count : " + count);
    }
}
