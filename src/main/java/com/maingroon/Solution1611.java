package com.maingroon;

public class Solution1611 {

    // https://en.wikipedia.org/wiki/Gray_code#Converting_to_and_from_Gray_code
    public int minimumOneBitOperations(int n) {
        int result = n;
        result ^= result >> 16;
        result ^= result >> 8;
        result ^= result >> 4;
        result ^= result >> 2;
        result ^= result >> 1;
        return result;
    }
}
