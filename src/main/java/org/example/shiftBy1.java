package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class shiftBy1 {

    static void shiftBy1(int[] arr) {
        // step 1: store last wale ki value
        int n = arr.length;
        int temp = arr[n-1];
        // step 2: shift all values of array
        for(int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        // step 3: temp ki value ko 0 index pr copy
        arr[0] = temp;
    }

    static void main() {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,1,2,3,4};
        int arr3[] = {4, 5, 1, 2, 3};
        shiftBy1(arr1);
        shiftBy1(arr2);
        shiftBy1(arr3);



        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
