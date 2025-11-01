package com.maingroon;

import java.util.HashSet;

class Solution3289 {

    // this realization better for general tasks, not only for leetcode boundaries
    public int[] getSneakyNumbers(int[] nums) {
        int[] sneakyNumbers = new int[2];
        int wi = 0;

        HashSet<Integer> existingNumbers = new HashSet<>();
        for (int num : nums) {
            if (existingNumbers.contains(num)) {
                sneakyNumbers[wi] = num;
                wi++;
                if (wi == 2) {
                    return sneakyNumbers;
                }
            } else {
                existingNumbers.add(num);
            }
        }
        return sneakyNumbers;
    }

//    first attempt solution with array
//    public int[] getSneakyNumbers(int[] nums) {
//        int[] sneakyNumbers = new int[2];
//        int wi = 0;
//
//        int[] existingNumbers = new int[100];
//        for (int ri = 0; ri < nums.length; ri++) {
//            int num = nums[ri];
//            if (existingNumbers[num] != 0) {
//                sneakyNumbers[wi] = num;
//                wi++;
//                if (wi == 2) {
//                    return sneakyNumbers;
//                }
//            } else {
//                existingNumbers[num] = num;
//            }
//        }
//        return sneakyNumbers;
//    }
}
