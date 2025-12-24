package com.maingroon;

import java.util.Arrays;

public class Solution3074 {

    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleSum = Arrays.stream(apple).sum();
        Arrays.sort(capacity);

        int result = 0;
        for (int i = capacity.length - 1; i >= 0 && appleSum > 0; i--) {
            appleSum -= capacity[i];
            result++;
        }
        return result;
    }
}
