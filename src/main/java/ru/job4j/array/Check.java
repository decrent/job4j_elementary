package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            boolean normal = data[0];
            if (data[data.length - 1 - i] != normal) {
                result = false;
            }
        }
        return result;
    }
}
