package se.iths.exercise.week7.state;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSearchUsingState {

    public static void main(String[] args) {
        String text = "This is my caaats favorite food.";
        boolean match = checkForCat(text);
        if(match)
            System.out.println("Text contains cat");
        else
            System.out.println("Text does not contain cat");

        //Same matching using regexp
        Pattern pattern = Pattern.compile("ca+t");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.find());
    }

    private static boolean checkForCat(String text) {
        State state = State.NO_MATCH;
        for (int i = 0; i < text.length(); i++) {
            state = state.check(text.charAt(i));
        }
        return state == State.CAT_MATCH;
    }
}

enum State {
    NO_MATCH,
    C_MATCH,
    CA_MATCH,
    CAT_MATCH;

    public State check(char character) {
        return switch(this) {
            case NO_MATCH -> {
                if( character == 'c') {
                    yield C_MATCH;
                }
                yield NO_MATCH;
            }
            case C_MATCH -> {
                if (character == 'c')
                    yield C_MATCH;
                if( character == 'a') {
                    yield CA_MATCH;
                }
                yield NO_MATCH;
            }
            case CA_MATCH -> {
                if( character == 'a') {
                    yield CA_MATCH;
                }
                if( character == 't') {
                    yield CAT_MATCH;
                }
                yield NO_MATCH;
            }
            case CAT_MATCH -> CAT_MATCH;
        };
    }
}
