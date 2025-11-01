package com.maingroon;

class Solution5 {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            int oddRadius = findPalindromeRadius(s, i, i);
            if (maxLen < oddRadius * 2 - 1) {
                start = i - oddRadius + 1;
                maxLen = oddRadius * 2 - 1;
            }
            int evenRadius = findPalindromeRadius(s, i, i + 1);
            if (maxLen < evenRadius * 2) {
                start = i - evenRadius + 1;
                maxLen = evenRadius * 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private int findPalindromeRadius(String s, int left, int right) {
        int radius = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            radius++;
            left--;
            right++;
        }
        return radius;
    }

//    first attempt solution
//    public String longestPalindrome(String s) {
//        if (s.length() <= 1) {
//            return s;
//        }
//
//        int longestStart = 0;
//        int maxLength = 1;
//        for (int i = 0; i < s.length(); i++) {
//            int latest = s.length() - 1;
//            while (maxLength <= latest - i && i <= latest) {
//                latest = findLatestChar(s, s.charAt(i), i, latest);
//                if (latest >= 0) {
//                    if (isPalindrome(s, i, latest + 1) && maxLength < latest - i + 1) {
//                        longestStart = i;
//                        maxLength = latest - longestStart + 1;
//                        latest = -1;
//                    } else {
//                        latest--;
//                    }
//                }
//            }
//        }
//        return s.substring(longestStart, longestStart + maxLength);
//    }
//
//    public int findLatestChar(String s, char c, int start, int end) {
//        for (int i = end; i > start; i--) {
//            if (s.charAt(i) == c) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public boolean isPalindrome(String s, int start, int end) {
//        int length = end - start;
//        for (int i = 0; i < length / 2; i++) {
//            if (s.charAt(start + i) != s.charAt(end - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }
}