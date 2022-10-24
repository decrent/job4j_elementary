package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int rsl = Max.max(1, 2);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax35To23Then35() {
        int left = 35;
        int right = 23;
        int expected = 35;
        int rsl = Max.max(35, 23);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax12To13Then13() {
        int left = 12;
        int right = 13;
        int expected = 13;
        int rsl = Max.max(12, 13);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax15To15Then15() {
        int left = 15;
        int right = 15;
        int expected =15;
        int rsl = Max.max(15, 15);
        assertThat(rsl).isEqualTo(expected);
    }
}