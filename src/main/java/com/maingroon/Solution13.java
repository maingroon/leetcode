package com.maingroon;

import java.util.Map;

public class Solution13 {

    private static final Map<Character, Integer> ROMAN_TO_DECIMAL = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int result = 0;
        int hold = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = ROMAN_TO_DECIMAL.get(s.charAt(i));
            if (hold > 0 && cur > hold) {
                result += cur - hold;
                hold = 0;
            } else {
                result += hold;
                hold = cur;
            }
        }
        result += hold;
        return result;
    }
}
