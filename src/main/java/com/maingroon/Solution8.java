package com.maingroon;

public class Solution8 {
    public int myAtoi(String s) {
        boolean skipSpaces = true;
        int signNum = 0;
        int result = 0;
        boolean allCharsAllowed = true;
        int charIdx = 0;
        while (allCharsAllowed && charIdx < s.length()) {
            char c = s.charAt(charIdx);
            if (c == ' ' && skipSpaces) {
                charIdx++;
            } else if ((c == '-' || c == '+') && signNum == 0) {
                skipSpaces = false;
                if (c == '-') {
                    signNum = -1;
                } else {
                    signNum = 1;
                }
                charIdx++;
            } else if (c >= '0' && c <= '9') {
                skipSpaces = false;
                if (signNum == 0) {
                    signNum = 1;
                }
                if (c != '0' || result != 0) {
                    if (signNum > 0 && result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && (c - '0' > 6))) {
                        result = Integer.MAX_VALUE;
                        allCharsAllowed = false;
                    } else if (signNum < 0 && result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && (c - '0' > 7))) {
                        result = Integer.MIN_VALUE;
                        allCharsAllowed = false;
                    } else {
                        result *= 10;
                        result += signNum * (c - '0');
                    }
                }
                charIdx++;
            } else {
                allCharsAllowed = false;
            }
        }
        return result;
    }
}
