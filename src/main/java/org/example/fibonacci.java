package org.example;

public class fibonacci {
    public static void main(String[] args) {
        int n = 7;
        long[] fibSequence = fibonacci(n);
        for (long num : fibSequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static long[] fibonacci(int n) {
        if (n <= 0) return new long[0];
        if (n == 1) return new long[] {0};
        if (n == 2) return new long[] {0, 1};

        long[] fibSequence = new long[n];
        fibSequence[0] = 0;
        fibSequence[1] = 1;
        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        return fibSequence;
    }
}

// this is git line//