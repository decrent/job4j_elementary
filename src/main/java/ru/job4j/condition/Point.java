package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double first = Math.pow(rsl, 2);
        double rsl2 = y2 - y1;
        double second = Math.pow(rsl2, 2);
        double third = first + second;
        double rsl3 = Math.sqrt(third);
        return rsl3;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 7, 12, 16);
        System.out.println("result (4, 7) to (12, 16) " + result);
    }
}