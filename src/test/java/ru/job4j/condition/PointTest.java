package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when47To1216Then1204() {
        int x1 = 4;
        int x2 = 7;
        int y1 = 12;
        int y2 = 16;
        double expetcted = 12.04;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expetcted, out, 0.01);
    }

    @Test
    public void when35To40Then509() {
        int x1 = 3;
        int x2 = 5;
        int y1 = 4;
        int y2 = 0;
        double expected = 5.09;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1377To2288Then14212() {
        int x1 = 13;
        int x2 = 77;
        int y1 = 22;
        int y2 = 88;
        double expected = 14.212;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when1167To9999Then93637599() {
        int x1 = 11;
        int x2 = 67;
        int y1 = 99;
        int y2 = 99;
        double expected = 93.637599;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.00001);
    }
}