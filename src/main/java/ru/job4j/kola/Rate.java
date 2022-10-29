package ru.job4j.kola;

public class Rate {
    public static double zxc(double revenue, double cogs, double calc, double bbr) {
        double ebitda = revenue - cogs;
        double riskPremium = calc / ebitda;
        double baseRisk = 5;
        double result = baseRisk;
        for (double rate = 1; rate <= riskPremium; rate += 0.5) {
            if (rate % 1 == 0) {
                result += rate;
            }
            return result;
        }
        return result;
    }
}
