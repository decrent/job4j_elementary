package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && Character.isLowerCase(name.codePointAt(0));
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (valid) {
                if (!isLowerLatinLetter(code) && !isSpecialSymbol(code) && !isUpperLatinLetter(code) && !Character.isDigit(code)) {
                    valid = false;
                }
            } else {
                return false;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}