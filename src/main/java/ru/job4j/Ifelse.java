package ru.job4j;

public class Ifelse {
    public static void main(String[] args) {
        int a = 12;
        int b = 11;
        int c = 13;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}