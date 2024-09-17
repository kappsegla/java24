package se.iths.oop;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class SafeDemo {

    public static void main(String[] args) {
        Safe safe = Safe.of("p@ssw0rd");

        var list = List.of(1, 2, 3, 4);
        var dateAndTime = LocalDateTime.now();
        var locale = Locale.of("sv", "SE");
        Locale.setDefault(locale);
        var integer = Integer.valueOf(1);
    }
}
