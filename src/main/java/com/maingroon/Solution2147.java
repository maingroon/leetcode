package com.maingroon;

public class Solution2147 {

    private static final int MOD = 1000000007;

    public int numberOfWays(String corridor) {
        int seats = 0;
        int fpe = 0; // first seats pair end index
        int lps = 0; // last seats pair start index
        int lsi = 0; // last seat index
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                seats++;

                if (seats == 2) {
                    fpe = i;
                }

                lps = lsi;
                lsi = i;
            }
        }
        if (seats < 2 || seats % 2 != 0) {
            return 0;
        }

        long result = 1;
        int i = fpe + 1;
        while (i < lps) {
            int plants = 1;
            while (i < lps && corridor.charAt(i) == 'P') {
                plants++;
                i++;
            }
            result = (result * plants) % MOD;
            int skipSeats = 2;
            while (i < lps && skipSeats > 0) {
                if (corridor.charAt(i) == 'S') {
                    skipSeats--;
                }
                i++;
            }
        }
        return (int) result;
    }
}
