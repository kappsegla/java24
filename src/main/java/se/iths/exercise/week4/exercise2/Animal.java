package se.iths.exercise.week4.exercise2;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {
    private final String speciesName;
    private int size;

    public Animal(String speciesName, int size) {
        this.speciesName = speciesName;
        this.size = size;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return size == animal.size && Objects.equals(speciesName, animal.speciesName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciesName, size);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
               "speciesName='" + speciesName + '\'' +
               ", size=" + size +
               '}';
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(size, o.size);
    }
}
