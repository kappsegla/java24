package se.iths.card;

public class Validator {

    //Luhn algorithm for validating payment card numbers
    public static boolean valid(String cardNumber) {
        //Check length of number
        if (cardNumber.length() != 16) {
            return false;
        }
        //Check for only digits 0-9 in number
        int sum = 0;
        for (int i = 0; i < cardNumber.length(); i++) {
            if (!Character.isDigit(cardNumber.charAt(i))) {
                return false;
            }
            int num = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
            if (i % 2 == 0) { //Even index multiply by 2
                num *= 2;
                if (num > 9)  //If result > 9
                    num = num - 9; // 1 + (num - 10) Add digits together 16-> 1 + 6
            }
            sum += num;
        }
        System.out.println(sum);

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(valid("4137894711755904"));
    }

}
