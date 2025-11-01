package com.maingroon;

class Solution6 {
    public String convert(String s, int numRows) {
        int length = s.length();
        if (numRows <= 1 || numRows >= length) {
            return s;
        }

        int cycleLen = 2 * (numRows - 1);
        char[] result = new char[length];
        int wi = 0;
        for (int row = 0; row < numRows; row++) {
            for (int ri = row; ri < length; ri += cycleLen) {
                result[wi++] = s.charAt(ri);
                if (row > 0 && row < numRows - 1) {
                    int mri = ri + cycleLen - 2 * row;
                    if (mri < s.length()) {
                        result[wi++] = s.charAt(mri);
                    }
                }
            }
        }

        return new String(result);
    }

//    optimized version without matrix
//    public String convert(String s, int numRows) {
//        if (numRows <= 1 || numRows >= s.length()) {
//            return s;
//        }
//
//        StringBuilder[] data = new StringBuilder[numRows];
//        for (int row = 0; row < numRows; row++) {
//            data[row] = new StringBuilder();
//        }
//
//        boolean isDownward = true;
//        for (int ri = 0, currentRow = 0; ri < s.length(); ri++) {
//            data[currentRow].append(s.charAt(ri));
//
//            if (isDownward && currentRow == numRows - 1) {
//                isDownward = false;
//            } else if (!isDownward && currentRow == 0) {
//                isDownward = true;
//            }
//
//            if (isDownward && currentRow + 1 < numRows) {
//                currentRow++;
//            } else {
//                currentRow--;
//            }
//        }
//
//        StringBuilder result = new StringBuilder(s.length());
//        for (int row = 0; row < numRows; row++) {
//            result.append(data[row]);
//        }
//
//        return result.toString();
//    }

//    first attempt solution
//    public String convert(String s, int numRows) {
//        int length = s.length();
//        int numColumns = calculateColumns(length, numRows);
//        char[][] zigzag = new char[numColumns][numRows];
//
//        int diagonalIndex = 0;
//        int ci = 0;
//        for (int c = 0; c < numColumns; c++) {
//            if (diagonalIndex > 0) {
//                zigzag[c][diagonalIndex] = s.charAt(ci);
//                ci++;
//                diagonalIndex--;
//            } else {
//                for (int r = 0; r < numRows && ci < length; r++) {
//                    zigzag[c][r] = s.charAt(ci);
//                    ci++;
//                }
//                if (numRows > 2) {
//                    diagonalIndex = numRows - 2;
//                }
//            }
//        }
//
//        char[] result = new char[length];
//        ci = 0;
//        for (int r = 0; r < numRows; r++) {
//            for (int c = 0; c < numColumns; c++) {
//                if (zigzag[c][r] != 0) {
//                    result[ci] = zigzag[c][r];
//                    ci++;
//                }
//            }
//        }
//
//        return new String(result);
//    }
//
//    public int calculateColumns(int length, int numRows) {
//        int columns = 0;
//        int diagonalLength = numRows > 2 ? numRows - 2 : 0;
//        while (length > 0) {
//            columns++;
//            length -= numRows;
//
//            for (int d = 0; d < diagonalLength && length > 0; d++) {
//                columns++;
//                length--;
//            }
//        }
//        return columns;
//    }
}