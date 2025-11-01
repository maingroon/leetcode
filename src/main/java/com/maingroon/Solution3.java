package com.maingroon;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int[] last = new int[128];
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            left = Math.max(left, last[c]);
            max = Math.max(max, right - left + 1);
            last[c] = right + 1;
        }
        return max;
    }
}
