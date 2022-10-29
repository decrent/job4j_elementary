package ru.job4j.kola;

public class Calc {
    public static void main(String[] args) {
        double revenue = 220_000;
        double cogs = 200_000;
        double bbr = 5;
        System.out.println(Loan.calc(revenue));
        System.out.println(Rate.zxc(revenue, cogs, Loan.calc(revenue), bbr));
    }
}
