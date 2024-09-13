package se.iths.oop.person;

import java.time.LocalDate;

public class MemberLedger {
    private Person[] persons = new Person[3];

    public static void main(String[] args) {
        MemberLedger m = new MemberLedger();
        m.persons[0] = new Person("Donald", LocalDate.of(1996, 2, 29));
        m.persons[1] = new Person("Stella", LocalDate.of(2001, 7, 2));
        m.persons[2] = new Person("Kalle", LocalDate.of(1963, 1, 1));

        for (Person p : m.persons) {
            System.out.println(p.name() + " " + p.age() + " " + m.fee(p));
        }
    }

    public int fee(Person p) {
        if( p.name().equalsIgnoreCase("Kalle") ) {
            return 200;
        }
        if( p.age() < 25 ) {
            return 200;
        }
        return 350;
    }
}
