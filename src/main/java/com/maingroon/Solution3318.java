package com.maingroon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3318 {

    public int[] findXSum(int[] nums, int k, int x) {
        int[] xSum = new int[nums.length - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();

        for (int idx = 0; idx < nums.length; idx++) {
            freq.put(nums[idx], freq.getOrDefault(nums[idx], 0) + 1);
            if (idx >= k - 1) {
                xSum[idx - k + 1] = this.calculateSum(x, freq);

                int removedFreq = freq.get(nums[idx - k + 1]) - 1;
                if (removedFreq > 0) {
                    freq.put(nums[idx - k + 1], removedFreq);
                } else {
                    freq.remove(nums[idx - k + 1]);
                }
            }
        }
        return xSum;

    }

    private int calculateSum(int x, Map<Integer, Integer> freq) {
        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }

        list.sort((a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });

        int sum = 0;
        for (int i = 0; i < x && i < list.size(); i++) {
            sum += list.get(i)[0] * list.get(i)[1];
        }
        return sum;
    }
}
