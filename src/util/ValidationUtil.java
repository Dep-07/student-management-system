package util;

public class ValidationUtil {

    public static boolean isInteger(String input) {
        if (input.startsWith("+") || input.startsWith("-")) {
            return false;
        }

        try {
            Long.parseLong(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValid(String input, boolean checkSpaces, boolean checkDigits, char... symbols) {
        char[] chars = input.toCharArray();
        loop1:
        for (char aChar : chars) {

            if ((checkDigits && Character.isDigit(aChar) || (checkSpaces && Character.isSpaceChar(aChar)))) {
                continue;
            }

            for (char symbol : symbols) {
                if (aChar == symbol) {
                    continue loop1;
                }
            }

            if (!Character.isAlphabetic(aChar)) {
                return false;
            }
        }
        return true;
    }

}
