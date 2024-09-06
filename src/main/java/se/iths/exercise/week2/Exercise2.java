package se.iths.exercise.week2;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(isValidPassword("abc123defgäö"));
        System.out.println(isValidPassword("abc123def")); // 9 bokstäver
        System.out.println(isValidPassword("abc123defg!")); // ! är inte char eller digit


    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }
        int digMax = 0;

        for (int i = 0; i < password.length(); i++) {
            char digitsChar = password.charAt(i);

            // Check for a-z (letters)
            if (Character.isLetter(digitsChar) && Character.isLowerCase(digitsChar)) {
                continue;
            }

            // Check for 0-9 (digits)
            if (Character.isDigit(digitsChar)) {
                digMax++;
                continue;
            }

            // If the character is neither a letter nor a digit, it's invalid
            return false;
        }

        // Password is valid if it contains at least 2 digits
        return digMax >= 2;
    }


}
