package org.example;

public class AlternateExtreme {
    static void printalternateExtreme(int[] arr) {


     int start = 0;
     int end = arr.length -1;

     while (start <= end) {
         System.out.println(arr[start] + " ");
         start++;

         if(start <= end) {
             System.out.println(arr[end] + " ");
             end--;
         }
     }
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6};

        printalternateExtreme(arr);
    }
}
