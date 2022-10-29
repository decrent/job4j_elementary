package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        percent = percent / 100 + 1;
        while (amount * percent > salary) {
            amount *= percent;
            amount -= salary;
            year++;
        }
        return year;
    }
}
