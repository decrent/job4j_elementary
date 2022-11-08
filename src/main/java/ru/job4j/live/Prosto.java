package ru.job4j.live;

public class Prosto {
    public static void main(String[] args) {
        int code = 46;
        System.out.println(isUpperLatinLetter(code));
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code < 65 || code > 90) {
            return false;
        }
        return true;
    }
}
