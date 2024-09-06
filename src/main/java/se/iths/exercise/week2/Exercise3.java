package se.iths.exercise.week2;

public class Exercise3 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("boolean"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("saippuakivikauppias"));
        System.out.println(isPalindrome("1221"));
        System.out.println(isPalindrome("Tattarrattat"));
    }

    public static boolean isPalindrome(String input) {

    }
package se.iths.Excer2week;

    public class Excer2 {
        public static boolean cPass(String password) {
            if (password.length() < 10) {
                return false;
            }
            int digMax = 0;

            for (int i = 0; i < password.length(); i++) {
                char digitsChar = password.charAt(i);

                // Check for a-z (letters)
                if (Character.isLetter(digitsChar)) {
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

        // A simple main method to test the password validator
        public static void main(String[] args) {
            System.out.println(cPass("abc1234567"));  // Should return true (valid)
            System.out.println(cPass("abcdefghij"));  // Should return false (no digits)
            System.out.println(cPass("123456"));      // Should return false (too short)
            System.out.println(cPass("abcde123$%"));  // Should return false (contains invalid characters)
        }
    }
}
