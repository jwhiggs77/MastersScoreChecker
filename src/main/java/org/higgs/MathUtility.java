package org.higgs;

public class MathUtility {
    public static int getMax(int a, int b, int c, int d) {
        int max = a;

        // Compare with the remaining numbers
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }

    public static int getBestScore(int a, int b, int c, int d) {
        int minVal = a;

        if (b < minVal) {
            minVal = b;
        }
        if (c < minVal) {
            minVal = c;
        }
        if (d < minVal) {
            minVal = d;
        }

        return minVal;
    }
}
