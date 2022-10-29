package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {3, 4, 5, 23, 21, 1, 6};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas43Then7() {
        int[] data = new int[] {1, 2, 3, 4, 7, 42, 12, 43, 35};
        int el = 43;
        int result = FindLoop.indexOf(data, el);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas228Then3() {
        int[] data = new int[] {23431, 657, 45, 228, 789, 3476, 1, 23, 5};
        int el = 228;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}