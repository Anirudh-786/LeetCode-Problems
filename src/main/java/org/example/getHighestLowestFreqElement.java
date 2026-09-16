package org.example;

import java.util.HashMap;

public class getHighestLowestFreqElement {
    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        //insert data
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num,0) +1);
        }
        //hashmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for(int key: freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                //highestFreq ko update karna chaiye
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key: freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowestFreq){
                //its time to update
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }

    static void main() {
        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println("highest freq wala num " + ans[0]);
        System.out.println("lowest freq wala num " + ans[1]);

    }
}
