package se.iths.search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("colou?r");
        Matcher m = p.matcher("The color grey is a colour");
        while (m.find()) {
            System.out.println(m.start());
            System.out.println(m.end());
        }
    }
}
