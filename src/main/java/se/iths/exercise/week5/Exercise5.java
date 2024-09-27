package se.iths.exercise.week5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Exercise5 {

    static Map<String, String> capitals = new HashMap<>();

    //static initialization block
    static {
        capitals.put("Sweden", "Stockholm");
        capitals.put("Germany", "Berlin");
        capitals.put("Belgium", "Bryssel");
        capitals.put("Norway", "Oslo");
    }

    public static void main(String[] args) {
        System.out.println(getCapital("Sweden"));
        System.out.println(getCapital("Germany"));
        System.out.println(getCapital("Belgium"));
        System.out.println(getCapital("Norway"));
        System.out.println(getCapital("Denmark"));
    }

    public static String getCapital(String country) {
        return capitals.computeIfAbsent(country, throwExceptionIfAbsent());
//        if (!capitals.containsKey(country))
//            throw new CountryNotImplementedYetException();
//        return capitals.get(country);
    }

    private static Function<String, String> throwExceptionIfAbsent() {
        return (key) -> {
            throw new CountryNotImplementedYetException(key);
        };
    }
}

class CountryNotImplementedYetException extends RuntimeException {
    CountryNotImplementedYetException(String key) {
        super(key + " not found");
    }
}
