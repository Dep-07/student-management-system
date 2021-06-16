package util;

public class ValidationUtilTest {

    public static void main(String[] args) {
//        isValid("ad fas,123", true, true, '.', ',');
        isValidEmail("abc@ij.ed.com");

//        String input = "abc.1...23.456";
//        System.out.println(input.indexOf('.'));
        String input = "abc@ijse@abc";
//        System.out.println(input.split("@",1).length);
    }

    public static void isValid(String input, boolean checkSpaces, boolean checkDigits, char... symbols) {
        assert ValidationUtil.isValid(input, checkSpaces, checkDigits, symbols) : "Validation Failed";
    }

    public static void isValidEmail(String input) {
        assert ValidationUtil.isValidEmail(input) : "Invalid email";
    }
}
