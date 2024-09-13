package se.iths.oop.person;

import se.iths.oop.person.membertype.HonoraryMember;
import se.iths.oop.person.membertype.NormalMember;

import java.time.LocalDate;

public class MemberLedger {
    private Person[] persons = new Person[3];

    public static void main(String[] args) {
        MemberLedger m = new MemberLedger();
        m.persons[0] = new Person("Donald", LocalDate.of(1996, 2, 29), new NormalMember() );
        m.persons[1] = new Person("Stella", LocalDate.of(2001, 7, 2), new NormalMember());
        m.persons[2] = new Person("Kalle", LocalDate.of(1963, 1, 1), new HonoraryMember());

        m.persons[2] = m.persons[2].withName("Changed");

        for (Person person : m.persons) {
            System.out.println(person.name() + " " + person.age() + " " + m.fee(person));
        }

//        for (int i = 0; i < m.persons.length; i++) {
//            Person person = m.persons[i];
//            System.out.println(person.name() + " " + person.age() + " " + m.fee(person));
//        }
    }

    public int fee(Person p) {
        if (p.type() instanceof HonoraryMember) {
            return 200;
        }
        if (p.age() < 25) {
            return 200;
        }
        return 350;
    }
}
