import com.maingroon.Solution3289;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Solution3289Tests {

    private final Solution3289 solution = new Solution3289();

    private void assertEqualsInAnyOrder(int[] expected, int[] actual) {
        assertNotNull(actual);
        assertEquals(2, actual.length);
        if (expected[0] == actual[0]) {
            assertEquals(expected[1], actual[1]);
        } else {
            assertEquals(expected[0], actual[1]);
            assertEquals(expected[1], actual[0]);
        }
    }

    @Test
    void test1() {
        int[] input = new int[]{0, 1, 1, 0};
        assertEqualsInAnyOrder(new int[]{0, 1}, solution.getSneakyNumbers(input));
    }

    @Test
    void test2() {
        int[] input = new int[]{0, 3, 2, 1, 3, 2};
        assertEqualsInAnyOrder(new int[]{2, 3}, solution.getSneakyNumbers(input));
    }

    @Test
    void test3() {
        int[] input = new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        assertEqualsInAnyOrder(new int[]{4, 5}, solution.getSneakyNumbers(input));
    }
}
