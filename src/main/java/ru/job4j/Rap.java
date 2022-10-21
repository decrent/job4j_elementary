package ru.job4j;

public class Rap {
    public static String хуйВРотСтайлс(String репер) {
        return репер;
    }

    public static void main(String[] args) {
        String репер = "пидр";
        String man = Rap.хуйВРотСтайлс(репер);
        System.out.println("Рома " + man);
    }
}
