package org.example;

 class reverseArray {

   static void reverseArray(int[] arr) {

//       int n = arr.length;
//       int i = 0;
//       int j = n-1;
//
//       while (i<=j){
//           int temp =arr[i];
//           arr[i]= arr[j];
//           arr[j]= temp;
//           // i ko aage badhao
//           i++;
//           // j ko piche le jao
//           j--;
//       }
//
//       for (int k : arr) {
//           System.out.println(k);
//       }

       int n = arr.length;
       int i = 0;
       int j = n-1;

       while (i<=j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           // i ko aage badhao
           i++;
           // i ko piche lo
           j--;
       }

       for (int k : arr) {
           System.out.print(k + " ");
       }
   }
   static void main () {
       int[] arr = {1, 2, 3, 4, 5, 6};
       reverseArray(arr);
   }
}

