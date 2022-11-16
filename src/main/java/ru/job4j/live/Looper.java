package ru.job4j.live;

public class Looper {
    public static void main(String[] args) {
        int columnCount = 7;
        String star = "*";
        String space = " ";
        int fact = columnCount - 1;
        for (int row = 0; row < columnCount; row++) {
            for (int cell = 0; cell < columnCount; cell++) {
                boolean straight = row == 0 || row == fact;
                boolean left = row == cell;
                boolean right = row + cell == fact;
                boolean skipLeft = row > cell;
                boolean skipRight = row + cell < fact;
                if (straight) {
                    System.out.print(star);
                } else if (left) {
                    System.out.print(star);
                } else if (right) {
                    System.out.print(star);
                } else if (skipLeft) {
                    System.out.print(space);
                } else if (skipRight) {
                    System.out.print(space);
                }
            }
            if (row < columnCount - 1) {
                System.out.println();
            }
        }
    }
}