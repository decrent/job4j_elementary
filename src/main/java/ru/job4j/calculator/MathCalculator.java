package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double diffAndFraction(double first, double second) {
        return diff(first, second)
                + fractoin(first, second);
    }

    public static double globalSum(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + diff(first, second)
                + fractoin(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат числа равен " + sumAndMultiply(10, 20));
        System.out.println("Результат числа равен " + diffAndFraction(10, 20));
        System.out.println("Результат числа равен " + globalSum(10, 20));
    }

}