package com.maingroon;

public class Solution3234 {

    public int numberOfSubstrings(String s) {
        int[] prefix = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i - 1) == '0') {
                prefix[i + 1] = i;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }

        int count = 0;
        for (int i = 1; i <= s.length(); i++) {
            int zeros = s.charAt(i - 1) == '0' ? 1 : 0;
            int j = i;
            while (j > 0 && i > zeros * zeros) {
                int ones = i - prefix[j] - zeros;
                if (zeros * zeros <= ones) {
                    count += Math.min(j - prefix[j], ones - zeros * zeros + 1);
                }
                j = prefix[j];
                zeros++;
            }
        }
        return count;
    }

//    second attempt with optimization
//    public int numberOfSubstrings(String s) {
//        int[] prefixZeros = new int[s.length() + 1];
//        int[] prefixOnes = new int[s.length() + 1];
//        for (int i = 1; i <= s.length(); i++) {
//            if (s.charAt(i - 1) == '0') {
//                prefixZeros[i] = prefixZeros[i - 1] + 1;
//                prefixOnes[i] = prefixOnes[i - 1];
//            } else {
//                prefixZeros[i] = prefixZeros[i - 1];
//                prefixOnes[i] = prefixOnes[i - 1] + 1;
//            }
//        }
//
//        int result = 0;
//        for (int length = s.length(); length > 0; length--) {
//            int count = 0;
//            for (int i = 0; i + length <= s.length(); i++) {
//                int zeros = prefixZeros[i + length] - prefixZeros[i];
//                int ones = prefixOnes[i + length] - prefixOnes[i];
//                if (ones >= zeros * zeros) {
//                    count++;
//                }
//            }
//            result += count;
//        }
//        return result;
//    }

//    first attempt solution
//    public int numberOfSubstrings(String s) {
//        Map<String, Integer> subCount = new HashMap<>();
//        for (int subLength = 1; subLength <= s.length(); subLength++) {
//            for (int i = 0; i + subLength <= s.length(); i++) {
//                String sub = s.substring(i, i + subLength);
//                if (subCount.containsKey(sub) || isOnesDominant(sub)) {
//                    subCount.put(sub, subCount.getOrDefault(sub, 0) + 1);
//                }
//            }
//        }
//        int sum = 0;
//        for (int value : subCount.values()) {
//            sum += value;
//        }
//        return sum;
//    }
//
//    private boolean isOnesDominant(String s) {
//        int[] numsCount = new int[2];
//        for (int i = 0; i < s.length(); i++) {
//            numsCount[s.charAt(i) - '0']++;
//        }
//        return numsCount[1] >= numsCount[0] * numsCount[0];
//    }
}
