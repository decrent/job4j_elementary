package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            int start = name.codePointAt(0);
            if (isLowerLatinLetter(start)) {
                if (isLowerLatinLetter(code) || isSpecialSymbol(code) || isUpperLatinLetter(code)) {
                    rsl = true;
                }
            } else {
                return false;
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 || code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 || code >= 122) {
            return true;
        }
        return false;
    }
}
