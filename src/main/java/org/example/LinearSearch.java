package org.example;

public class LinearSearch {
    static boolean findTarget(int arr[], int target) {
        for( int i=0; i<arr.length; i++) {

            if(arr[i] == target) {
                return true;
            }
        }

        //agar poora array travel ho chuka hai
        //and ek baar bhi target nahi mila
        //iska mtlb , target is not present in array
        //return false
        return false;
    }

    static void main() {
        int arr[] = {1,3,5,7,9};
        boolean ans = findTarget(arr, 9);
        System.out.println(ans);
    }



}
