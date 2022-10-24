package ru.job4j.condition;

public class Triangle {
    public static boolean exists(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exists(1, 1, 1));
    }
}