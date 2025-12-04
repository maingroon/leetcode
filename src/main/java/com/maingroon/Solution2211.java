package com.maingroon;

public class Solution2211 {

    public int countCollisions(String directions) {
        int sum = 0;
        int rightInRow = 0;
        int leftInRow = 0;
        for (int r = 0, l = directions.length() - 1; r < directions.length() && l >= 0; r++, l--) {
            if (directions.charAt(r) == 'R') {
                rightInRow++;
            } else {
                sum += rightInRow;
                rightInRow = 0;
            }

            if (directions.charAt(l) == 'L') {
                leftInRow++;
            } else {
                sum += leftInRow;
                leftInRow = 0;
            }
        }
        return sum;
    }

//    first attempt solution as prototype of logic
//    public int countCollisions(String directions) {
//        int[] points = new int[directions.length()];
//        int row = 0;
//        for (int i = 0; i < directions.length(); i++) {
//            if (directions.charAt(i) == 'R') {
//                row++;
//            } else {
//                points[i] += row;
//                row = 0;
//            }
//        }
//        row = 0;
//        for (int i = directions.length() - 1; i >= 0; i--) {
//            if (directions.charAt(i) == 'L') {
//                row++;
//            } else {
//                points[i] += row;
//                row = 0;
//            }
//        }
//
//        int sum = 0;
//        for (int point : points) {
//            sum += point;
//        }
//        return sum;
//    }
}
