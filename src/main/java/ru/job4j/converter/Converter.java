package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
       float in = 140;
       float expected = 2;
       float out = Converter.rubleToEuro(in);
       boolean passed = out == expected;
       System.out.println("140 rubles are 2. Test result: " + passed);
       in = 240;
       expected = 4;
       out = Converter.rubleToDollar(in);
       System.out.println("240 rubles are 4. Test result: " + passed);
    }
}