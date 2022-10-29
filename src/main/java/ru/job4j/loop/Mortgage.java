package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent = percent / 100 + 1;
        while (amount * percent > 0) {
            amount *= percent;
            amount -= salary;
            year++;
        }
        return year;
    }
}
