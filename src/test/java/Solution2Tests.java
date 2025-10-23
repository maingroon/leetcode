import com.maingroon.Solution2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution2Tests {

    private final Solution2 solution = new Solution2();

    private void checkListNodeEquality(Solution2.ListNode expected, Solution2.ListNode actual) {
        while (expected != null) {
            assertEquals(expected.val, actual.val);

            expected = expected.next;
            actual = actual.next;
        }
        assertNull(actual);
    }

    @Test
    void test1() {
        Solution2.ListNode input1 = new Solution2.ListNode(3);
        input1 = new Solution2.ListNode(4, input1);
        input1 = new Solution2.ListNode(2, input1);

        Solution2.ListNode input2 = new Solution2.ListNode(4);
        input2 = new Solution2.ListNode(6, input2);
        input2 = new Solution2.ListNode(5, input2);

        Solution2.ListNode expected = new Solution2.ListNode(7);
        expected = new Solution2.ListNode(0, expected);
        expected = new Solution2.ListNode(8, expected);

        Solution2.ListNode actual = solution.addTwoNumbers(input1, input2);
        checkListNodeEquality(expected, actual);
    }

    @Test
    void test2() {
        Solution2.ListNode input1 = new Solution2.ListNode(0);

        Solution2.ListNode input2 = new Solution2.ListNode(0);

        Solution2.ListNode expected = new Solution2.ListNode(0);

        Solution2.ListNode actual = solution.addTwoNumbers(input1, input2);
        checkListNodeEquality(expected, actual);
    }

    @Test
    void test3() {
        Solution2.ListNode input1 = new Solution2.ListNode(9);
        input1 = new Solution2.ListNode(9, input1);
        input1 = new Solution2.ListNode(9, input1);
        input1 = new Solution2.ListNode(9, input1);
        input1 = new Solution2.ListNode(9, input1);
        input1 = new Solution2.ListNode(9, input1);
        input1 = new Solution2.ListNode(9, input1);

        Solution2.ListNode input2 = new Solution2.ListNode(9);
        input2 = new Solution2.ListNode(9, input2);
        input2 = new Solution2.ListNode(9, input2);
        input2 = new Solution2.ListNode(9, input2);

        Solution2.ListNode expected = new Solution2.ListNode(1);
        expected = new Solution2.ListNode(0, expected);
        expected = new Solution2.ListNode(0, expected);
        expected = new Solution2.ListNode(0, expected);
        expected = new Solution2.ListNode(9, expected);
        expected = new Solution2.ListNode(9, expected);
        expected = new Solution2.ListNode(9, expected);
        expected = new Solution2.ListNode(8, expected);

        Solution2.ListNode actual = solution.addTwoNumbers(input1, input2);
        checkListNodeEquality(expected, actual);
    }
}
