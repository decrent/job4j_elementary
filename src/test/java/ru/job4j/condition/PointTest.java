package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when47To1216Then12dot04() {
        int x1 = 4;
        int y1 = 7;
        int x2 = 12;
        int y2 = 16;
        double expected = 12.04;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35To40Then5dot09() {
        int x1 = 3;
        int y1 = 5;
        int x2 = 4;
        int y2 = 0;
        double expected = 5.09;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1377To2288Then14dot212() {
        int x1 = 13;
        int y1 = 77;
        int x2 = 22;
        int y2 = 88;
        double expected = 14.212;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when1167To9999Then93dot637599() {
        int x1 = 11;
        int y1 = 67;
        int x2 = 99;
        int y2 = 99;
        double expected = 93.637599;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.00001);
    }
}