package org.example;

import java.util.Arrays;

public class SwapAlternate {

    static void swapAlternate(int[] arr) {

        for(int i = 0; i < arr.length -1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        swapAlternate(arr);

        System.out.println(Arrays.toString(arr));

        int middleIndex = arr.length/2;

        System.out.println("middle element: "+ arr[middleIndex]);
    }
}
