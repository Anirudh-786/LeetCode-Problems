package org.example;

public class PositiveNegativeSum {
    static int[] getPosNegSum(int arr[]) {
        int posSum = 0;
        int negSum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                // num is positive
                posSum = posSum + arr[i];
            } else {
                //num is negative
                negSum = negSum + arr[i];
            }
        }
        int ans[] = {posSum, negSum};
        return ans;
    }
    static void main() {
        int arr[] = {-7,-3,-8,-5,-6,1,3,5,7,9};
        int ans[] = getPosNegSum(arr);
        System.out.println("Positive Sum = " + ans[0]);
        System.out.println("Negative Sum = " + ans[1]);
    }
}
