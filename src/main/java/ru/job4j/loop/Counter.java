package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i = 0;
        for (i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 5));
        System.out.println(sum(10, 15));
        System.out.println(sum(22, 43));
        System.out.println(sum(25, 56));
        System.out.println(sum(505, 505));
    }
}
