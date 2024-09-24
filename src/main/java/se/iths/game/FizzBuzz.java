package se.iths.game;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(FizzBuzz.fizzBuzz(1));
        System.out.println(FizzBuzz.fizzBuzz(2));
        System.out.println(FizzBuzz.fizzBuzz(3));
        System.out.println(FizzBuzz.fizzBuzz(4));
        System.out.println(FizzBuzz.fizzBuzz(5));
        System.out.println(FizzBuzz.fizzBuzz(15));
    }

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz";
        if (n % 3 == 0)
            return "Fizz";
        if (n % 5 == 0)
            return "Buzz";
        return String.valueOf(n);
    }

    public static String fizzBuzz2(int n) {
        boolean mod3 = n % 3 == 0;
        boolean mod5 = n % 5 == 0;

        return switch (new Values(mod3, mod5)) {
            case Values(var m3, var m5) when m3 && m5 -> "FizzBuzz";
            case Values(var m3, var _) when m3 -> "Fizz";
            case Values(var _, var m5) when m5 -> "Buzz";
            case Values(var _, var _) -> String.valueOf(n);
        };
    }

    record Values(boolean mod3, boolean mod5) {
    }
}
