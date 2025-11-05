package com.maingroon;

import java.util.*;

public class Solution3318 {

    static class Pair {
        int num;
        int count;
        Pair(int n, int c) {
            num = n;
            count = c;
        }
    }

    static class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair a, Pair b) {
            if (a.count != b.count) {
                return Integer.compare(b.count, a.count);
            }
            return Integer.compare(b.num, a.num);
        }
    }

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
        List<Pair> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            list.add(new Pair(entry.getKey(), entry.getValue()));
        }

        list.sort(new PairComparator());

        int sum = 0;
        for (int i = 0; i < x && i < list.size(); i++) {
            sum += list.get(i).num * list.get(i).count;
        }
        return sum;
    }
}
