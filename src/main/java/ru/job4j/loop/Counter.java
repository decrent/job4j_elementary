package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i += 1) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int modulo(int number, int divider) {
        while (number >= divider) {
            number -= divider;
        }
        return number;
    }
}
