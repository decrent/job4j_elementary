package ru.job4j.calculator;

public class Calculator {

    public static void plus(int first, int second, int third, int zxc) {
        int result = first + second + third + zxc;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2, 4, 342);
        Calculator.plus(10, 11, 3, 34);
    }
}