package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumberTest {
    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when1() {
        int finish = 1;
        int result = PrimeNumber.calc(finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}