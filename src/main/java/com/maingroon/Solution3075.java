package com.maingroon;

import java.util.Arrays;

public class Solution3075 {

    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long sum = 0;
        int discount = 0;
        for (int i = happiness.length - 1; i >= happiness.length - k; i--) {
            if (discount < happiness[i]) {
                sum += happiness[i] - discount;
            }
            discount++;
        }
        return sum;
    }
}
