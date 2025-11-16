package com.maingroon;

public class Solution1513 {

    public int numSub(String s) {
        final int MODULO = 1000000007;
        int result = 0;
        int onesSeq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesSeq++;
                result = (result + onesSeq) % MODULO;
            } else {
                onesSeq = 0;
            }
        }
        return result;
    }
}
