import com.maingroon.Solution5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution5Tests {

    private final Solution5 problem = new Solution5();

    @Test
    void palindromic() {
        String palindromic1 = "bcdaadcb";
        String palindromic2 = "aboba";
        assertEquals(palindromic1, problem.longestPalindrome(palindromic1));
        assertEquals(palindromic2, problem.longestPalindrome(palindromic2));
    }

    @Test
    void oneSymbol() {
        String a = "a";
        String b = "b";
        assertEquals(a, problem.longestPalindrome(a));
        assertEquals(b, problem.longestPalindrome(b));
    }

    @Test
    void internal1() {
        String check = "cbcdcbedcbc";
        assertEquals("bcdcb", problem.longestPalindrome(check));
    }

    @Test
    void internal2() {
        String check = "abbcccbbbcaaccbababcbcabca";
        assertEquals("bbcccbb", problem.longestPalindrome(check));
    }

    @Test
    void internal3() {
        String check = "cbbd";
        assertEquals("bb", problem.longestPalindrome(check));
    }
}