package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTenToSixteenThenFivtyTwo() {
        int start = 10;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 52;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTwentyToThirtyThenOneHundredFifty() {
        int start = 20;
        int finish = 30;
        int result = Counter.sumByEven(start, finish);
        int expected = 150;
        assertThat(result).isEqualTo(expected);
    }
}