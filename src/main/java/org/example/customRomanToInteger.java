package org.example;
import java.util.Map;
import java.util.HashMap;

public class customRomanToInteger {

    public static int customRomanToInteger(String s) {

        Map<Character, Integer> values = new HashMap<>();

        values.put('@', 1);
        values.put('#', 5);
        values.put('$', 10);
        values.put('%', 50);
        values.put('^', 100);
        values.put('&', 500);
        values.put('*', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = values.get(s.charAt(i));

            if (i + 1 < s.length()) {

                int next = values.get(s.charAt(i + 1));

                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }
            } else {
                total += current;
            }
        }
            return total;
        }

    static void main() {
        System.out.println(customRomanToInteger("$@@@"));  // 13
        System.out.println(customRomanToInteger("@#"));    // 4
        System.out.println(customRomanToInteger("^*"));    // 900
    }
    }

