package com.maingroon;

public class Solution3228 {

    public int maxOperations(String s) {
        int operations = 0;
        int ones = 0;
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }
            boolean gapCounted = false;
            while (i < s.length() && s.charAt(i) == '0') {
                gapCounted = true;
                i++;
            }
            if (gapCounted) {
                operations += ones;
            }
        }
        return operations;
    }
}
