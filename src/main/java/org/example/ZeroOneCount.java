package org.example;

public class ZeroOneCount {
    static int[] getZeroOneCount(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;

        for(int i = 0; i< arr.length; i++) {
            if(arr [i] == 0) {
                zeroCount++;
            } else {
                //arr[i]=1
                oneCount++;
            }
        }
        int ans[] = {zeroCount, oneCount};
        return ans;
    }

    static void main() {
        int arr[] = {1,0,1,1,0,1,1};
        int ans[] = getZeroOneCount(arr);
        System.out.println("ZeroCount = "+ ans[0]);
        System.out.println("OneCount = "+ ans[1]);
    }
}
