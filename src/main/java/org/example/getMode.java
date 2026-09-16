package org.example;

import java.util.HashMap;

public class getMode {

    static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }
        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for(int key: freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);

            if(currentKeyKiFrequency > maxFreq) {
                // mujhe naya max mil gya
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        // jab loop se bahar aaoge toh max freq wali key ready hongi
        return maxFreqWaliKey;
    }

    static void main() {
        int arr[] = {1,2,2,3,3,3,4,4,4,4,4,4,5,5,5,5,5,5,5};
        int ans = getMode(arr);
        System.out.println(ans);
    }
}
