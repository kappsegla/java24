package se.iths.oop.animal;

import java.util.Objects;

public class Cat extends Animal {

    private String name = "Misse";
    private int livesLeft = 9;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.println("Mjau");
    }

    @Override
    public String toString() {
        return "Cat{" +
               "name='" + name + '\'' +
               ", livesLeft=" + livesLeft +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return livesLeft == cat.livesLeft && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, livesLeft);
    }
}
