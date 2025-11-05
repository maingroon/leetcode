package com.maingroon;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution3321 {

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
            return Long.compare(b.num, a.num);
        }
    }

    public long[] findXSum(int[] nums, int k, int x) {
        long[] result = new long[nums.length - k + 1];
        Map<Integer, Integer> numCount = new HashMap<>();
        TreeSet<Pair> top = new TreeSet<>(new PairComparator());
        TreeSet<Pair> other = new TreeSet<>(new PairComparator());
        long currentSum = 0;

        for (int idx = 0; idx < nums.length; idx++) {
            int num = nums[idx];
            int count = numCount.getOrDefault(num, 0);
            if (count > 0) {
                Pair oldPair = new Pair(num, count);
                if (top.remove(oldPair)) {
                    currentSum -= (long) count * num;
                } else {
                    other.remove(oldPair);
                }
            }

            count++;
            numCount.put(num, count);
            top.add(new Pair(num, count));
            currentSum += (long) count * num;

            if (top.size() > x) {
                Pair smallest = top.last();
                top.remove(smallest);
                currentSum -= (long) smallest.count * smallest.num;
                other.add(smallest);
            }

            if (idx >= k) {
                int oldNum = nums[idx - k];
                int oldCount = numCount.get(oldNum);
                Pair oldPair = new Pair(oldNum, oldCount);
                if (top.remove(oldPair)) {
                    currentSum -= (long) oldCount * oldNum;
                } else {
                    other.remove(oldPair);
                }

                oldCount--;
                numCount.put(oldNum, oldCount);
                if (oldCount > 0) {
                    Pair updatedPair = new Pair(oldNum, oldCount);
                    other.add(updatedPair);
                } else {
                    numCount.remove(oldNum);
                }

                if (top.size() < x && !other.isEmpty()) {
                    Pair best = other.first();
                    other.remove(best);
                    top.add(best);
                    currentSum += (long) best.count * best.num;
                }
            }

            if (idx >= k - 1) {
                result[idx - k + 1] = currentSum;
            }
        }
        return result;
    }
}
