package se.iths.oop.interf;

import se.iths.oop.animal.Animal;
import se.iths.oop.animal.Cat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface implements Serializable {
    public static void main(String[] args) {

        Interface i = new Interface();
        checkIfSerializable(i);
        String s = "Hej";
        checkIfSerializable(s);
        Integer n = 10;
        checkIfSerializable(n);
        Animal a = new Cat("Misse");
        checkIfSerializable(a);
        java.util.Scanner scanner = new Scanner(System.in);
        checkIfSerializable(scanner);
        List<String> list = new ArrayList<>();
        list.add("Misse");

        System.out.println(list.getFirst().length());
        System.out.println(list.getLast().length());

        List<String> immutableList = List.of("A","B","C","D");
        immutableList.add("E");  //Will throw unsupportedException because List.of returns ImmutableCollection


    }


    public static void checkIfSerializable(Object o){
        if( o instanceof Serializable )
            System.out.println("Serializable: " + o.getClass().getSimpleName());
        else
            System.out.println("Not Serializable: " + o.getClass().getSimpleName());
    }


}
