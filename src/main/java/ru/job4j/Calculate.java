package ru.job4j;

public class Calculate {
        public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
        }

        public static void main(String[] args) {
        Calculate.plus(12, 34);
        Calculate.plus(222, 88);
        }
}
