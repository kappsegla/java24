package se.iths.exercise.week2;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("boolean")); //false
        System.out.println(isPalindrome("racecar"));//True
        System.out.println(isPalindrome("level")); // true
        System.out.println(isPalindrome("saippuakivikauppias")); // true
        System.out.println(isPalindrome("1221")); // True
        System.out.println(isPalindrome("Tattarrattat")); // true
        System.out.println(isPalindrome(333)); // true
        System.out.println(isPalindrome(454)); // true
        System.out.println(isPalindrome(221)); // false
    }

    public static boolean isPalindrome(String input) {
        //Converts input to lowercase to be case INSENSITIVE
        input = input.toLowerCase();

        //Loop through all characters in string
        for (int i = 0; i < input.length() / 2; i++) {
            // Compares character at current index with it's reversed index
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String input) {
        StringBuilder palindrom = new StringBuilder(input);
        return palindrom.reverse().toString().equalsIgnoreCase(input);
    }

    public static boolean isPalindrome(int input) {
        return isPalindrome(String.valueOf(input));  //valueOf runs Integer.toString(input);
    }
}
