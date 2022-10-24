package ru.job4j;

public class Ifelse {
    public static void main(String[] args) {
        int a = 12;
        int b = 11;
        int c = 13;
        if (a > b) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else if (a > c) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }
}