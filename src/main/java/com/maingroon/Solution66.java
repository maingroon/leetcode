package com.maingroon;

public class Solution66 {

    // it's not optimal by time and space but input array isn't changed
    public int[] plusOne(int[] digits) {
        int rem = 1;
        for (int i = digits.length - 1; i >= 0 && rem > 0; i--) {
            rem = (digits[i] + rem) / 10;
        }

        int[] result = new int[digits.length + rem];
        rem = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            result[i + (result.length - digits.length)] = (digits[i] + rem) % 10;
            rem = (digits[i] + rem) / 10;
        }
        if (rem > 0) {
            result[0] = rem;
        }
        return result;
    }
}
