package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int strLen = s.length();
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int rightIdx = 0, leftIdx = 0; rightIdx < strLen; rightIdx++) {
            if (map.containsKey(s.charAt(rightIdx))) {
                leftIdx = Math.max(map.get(s.charAt(rightIdx)), leftIdx);
            }

            maxLen = Math.max(maxLen, rightIdx - leftIdx + 1);
            map.put(s.charAt(rightIdx), rightIdx + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();

        // Example 1: Expected output: 3
        String test1 = "abcabcbb";
        System.out.println("Input: \"" + test1 + "\" -> Output: " + solution.lengthOfLongestSubstring(test1));

        // Example 2: Expected output: 1
        String test2 = "bbbbb";
        System.out.println("Input: \"" + test2 + "\" -> Output: " + solution.lengthOfLongestSubstring(test2));

        // Example 3: Expected output: 3
        String test3 = "pwwkew";
        System.out.println("Input: \"" + test3 + "\" -> Output: " + solution.lengthOfLongestSubstring(test3));
    }
}
