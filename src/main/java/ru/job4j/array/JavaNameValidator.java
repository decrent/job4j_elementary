package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            int start = name.codePointAt(0);
            if (!name.isEmpty() && Character.isLowerCase(start))  {
                if (isLowerLatinLetter(code) || isSpecialSymbol(code) || isUpperLatinLetter(code) || Character.isDigit(code)) {
                    valid = true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code != 36 || code != 95) {
            return false;
        }
        return true;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code < 65 || code > 90) {
            return false;
        }
        return true;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code < 97 || code > 122) {
            return false;
        }
        return true;
    }

}
