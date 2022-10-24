package ru.job4j.condition;

public class Club {
    public static void permisson(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Club.permisson(true, true);
        Club.permisson(true, false);
        Club.permisson(false, true);
        Club.permisson(false, false);
    }
}