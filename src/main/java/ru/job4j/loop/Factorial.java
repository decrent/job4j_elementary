package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int i = 0; i <= n; i += 1) {
            if (i == 0) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.calc(5));
    }
}
