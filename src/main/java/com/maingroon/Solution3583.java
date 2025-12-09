package com.maingroon;

import java.util.HashMap;
import java.util.Map;

public class Solution3583 {

    private static final int MOD = 1000000007;

    public int specialTriplets(int[] nums) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        for (int num : nums) {
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1);
        }

        long result = 0;
        Map<Integer, Integer> partCount = new HashMap<>();
        for (int num : nums) {
            int bound = num * 2;
            int leftCount = partCount.getOrDefault(bound, 0);
            partCount.put(num, partCount.getOrDefault(num, 0) + 1);

            int rightCount = numsCount.getOrDefault(bound, 0) - partCount.getOrDefault(bound, 0);
            result += (long) leftCount * rightCount;
        }
        return (int) (result % MOD);
    }

//    first attempt solution
//    public int specialTriplets(int[] nums) {
//        Map<Integer, List<Integer>> cache = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!cache.containsKey(nums[i])) {
//                cache.put(nums[i], new ArrayList<>());
//            }
//            cache.get(nums[i]).add(i);
//        }
//
//        int count = 0;
//        for (Map.Entry<Integer, List<Integer>> record : cache.entrySet()) {
//            int num = record.getKey();
//            List<Integer> boundIndexes = record.getValue();
//            if (boundIndexes.size() < 2 || num % 2 == 1 || !cache.containsKey(num / 2)) {
//                continue;
//            }
//
//            List<Integer> centralIndexes = cache.get(num / 2);
//            for (int i = 0; i < boundIndexes.size(); i++) {
//                for (int j = 1; j < boundIndexes.size(); j++) {
//                    for (int k = 0; k < centralIndexes.size(); k++) {
//                        if (boundIndexes.get(i) < centralIndexes.get(k) &&
//                                boundIndexes.get(j) > centralIndexes.get(k)) {
//                            count++;
//                        }
//                    }
//                }
//            }
//        }
//        return count;
//    }
}
