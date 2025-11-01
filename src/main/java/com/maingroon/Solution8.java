package com.maingroon;

class Solution8 {
    public int myAtoi(String s) {
        int charIdx = 0;
        while (charIdx < s.length() && s.charAt(charIdx) == ' ') {
            charIdx++;
        }

        int sign = 1;
        if (charIdx < s.length()) {
            if (s.charAt(charIdx) == '-') {
                sign = -1;
                charIdx++;
            } else if (s.charAt(charIdx) == '+') {
                charIdx++;
            }
        }

        int result = 0;
        while (charIdx < s.length() && s.charAt(charIdx) >= '0' && s.charAt(charIdx) <= '9') {
            int num = sign * (s.charAt(charIdx) - '0');
            if (sign > 0 && result > (Integer.MAX_VALUE - num) / 10) {
                return Integer.MAX_VALUE;
            }
            if (sign < 0 && result < (Integer.MIN_VALUE - num) / 10) {
                return Integer.MIN_VALUE;
            }
            result = result * 10 + num;
            charIdx++;
        }
        return result;
    }
}
