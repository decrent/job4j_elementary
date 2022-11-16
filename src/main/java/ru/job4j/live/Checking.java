package ru.job4j.live;

public class Checking {
    public static void main(String[] args) {
        int[][] stray = new int[5][5];
        int x = 1;
        int y = 1;
        for (int row = 0; row < stray.length; row++) {
            for (int cell = 0; cell < stray.length; cell++) {
                stray[row][cell] = y;
                y += 1;
            }
        }
        for (int row = 0; row < stray.length; row++) {
            for (int cell = 0; cell < stray.length; cell++) {
                System.out.print(stray[row][cell]);
            }
            System.out.println();
        }
    }
}
