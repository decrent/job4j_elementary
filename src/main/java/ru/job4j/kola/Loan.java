package ru.job4j.kola;

public class Loan {
    public static double calc(double revenue) {
        double result = 0;
        double percent = 0.25;
        if (revenue * percent >= 40000 && revenue * percent <= 50000) {
            result = revenue * percent;
        } else if (revenue * percent >= 50000) {
            result = 50000;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Loan.calc(50000000));
    }
}
