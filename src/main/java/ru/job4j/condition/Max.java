package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return left > middle ? left : middle;
    }

    public static int max(int left, int right, int another, int middle) {
        return another > right ? another : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(25, 24, 59, 98);
        System.out.println(rsl);
        rsl = Max.max(43, 65, 34);
        System.out.println(rsl);
    }
}
