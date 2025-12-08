package com.maingroon;

public class Solution1523 {

    public int countOdds(int low, int high) {
        int range = high - low + 1;
        if (low % 2 == 1 && high % 2 == 1) {
            return (range / 2) + 1;
        }
        return range / 2;
    }

//    first attempt solution
//    public int countOdds(int low, int high) {
//        if (low == high) {
//            return low % 2 == 1 ? 1 : 0;
//        }
//
//        int count = 0;
//        int dif = high - low;
//        if (low % 2 == 1) {
//            count++;
//        }
//        if (high % 2 == 1) {
//            count++;
//        }
//        if (low % 2 == 1 && high % 2 == 1) {
//            dif--;
//        }
//        if (low % 2 == 0 && high % 2 == 0) {
//            dif++;
//        }
//        count += dif / 2;
//        return count;
//    }
}
