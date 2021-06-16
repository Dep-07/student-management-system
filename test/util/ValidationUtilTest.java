package util;

public class ValidationUtilTest {

    public static void main(String[] args) {
        isValid("ad fas,123", true, true, '.', ',');
    }

    public static void isValid(String input, boolean checkSpaces, boolean checkDigits, char... symbols) {
        assert ValidationUtil.isValid(input, checkSpaces, checkDigits, symbols) : "Validation Failed";
    }
}
