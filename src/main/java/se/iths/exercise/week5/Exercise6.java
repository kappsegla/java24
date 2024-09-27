package se.iths.exercise.week5;

import java.util.*;

import static se.iths.exercise.week5.Exercise4.createSetFromString;

public class Exercise6 {

    public static Map<String, Set<Integer>> index = new HashMap<>();

    public static void main(String[] args) {
        List<String> quotes = initialize();
        buildIndex(quotes);
        var indices = index.get("java");
        System.out.println(indices);
        System.out.println(index.getOrDefault("developer", Set.of()));
        System.out.println(index.getOrDefault("glasses", Set.of())); // Returns null unless we specify default value
    }

    private static void buildIndex(List<String> quotes) {
        for (int i = 0; i < quotes.size(); i++) {
            Set<String> words = createSetFromString(quotes.get(i));

            for (String word : words) {
                word = word.replaceAll("[!?.,:;]", "");
                index.computeIfAbsent(word, _ -> new HashSet<>()).add(i);
            }
        }
    }

    private static List<String> initialize() {
        List<String> quotes = new ArrayList<>();

        quotes.add("Why do Java developers wear glasses? Because they can't C#!");
        quotes.add("Why did the Java developer go broke? Because he lost his JavaBeans!");
        quotes.add("How do you spot a Java programmer at a party? They're the ones constantly throwing exceptions!");
        quotes.add("Why did the Java developer bring a ladder to the office? He heard the coffee was on the Java roof!");
        quotes.add("What do you call a haunted Java programming language? A Java ghost script!");
        quotes.add("Why do programmers prefer dark mode? Because light attracts bugs!");
        quotes.add("Why was the JavaScript developer sad? Because he didn't know how to 'null' his feelings.");
        quotes.add("Why do Python programmers have low self-esteem? Because they're constantly comparing themselves to others.");
        quotes.add("Why did the developer go broke? Because he used up all his cache.");
        quotes.add("Why do programmers hate nature? It has too many bugs.");
        return quotes;
    }
}
