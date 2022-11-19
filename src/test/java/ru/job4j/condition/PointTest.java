package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when01To06Then5() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 6);
        double expected = 5;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when15to1510Then14dot86() {
        Point a = new Point(1, 5);
        Point b = new Point(15, 10);
        double expected = 14.866068747318506;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected);
    }
}