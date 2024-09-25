package se.iths.collections;

import se.iths.oop.person.Person;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();

        personMap.put("Martin", new Person("Martin", LocalDate.of(1977, 6, 16), null));
        personMap.put("Kalle", new Person("Kalle", LocalDate.of(1967, 2, 27), null));

        System.out.println(personMap.get("Martin"));
        System.out.println(personMap.get("Olle"));  //Returns null since we have no key Olle
    }
}
