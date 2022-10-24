package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenExists() {
        int ab = 2;
        int ac = 2;
        int bc = 2;
        boolean rsl = Triangle.exists(2,2,2);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenNotExists() {
        int ab = 2;
        int ac = 1;
        int bc = 0;
        boolean rsl = Triangle.exists(2, 1 ,0);
        assertThat(rsl).isFalse();
    }
}