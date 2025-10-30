package com.maingroon;

public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int operand = x;
        int reverse = 0;
        while (operand > 0) {
            reverse = reverse * 10 + operand % 10;
            operand /= 10;
        }
        return x == reverse;
    }
}
