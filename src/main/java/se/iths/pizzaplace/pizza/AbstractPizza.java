package se.iths.pizzaplace.pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractPizza implements Pizza {
    private final String name;
    private final List<String> description = new ArrayList<>(List.of("Tomato sauce", "🧀"));
    private final int price;

    public AbstractPizza(String name, int price, List<String> description) {
        this.name = name;
        this.price = price;
        this.description.addAll(description);
    }

    @Override
    public int getCost() {
        return price;
    }

    @Override
    public List<String> getDescription() {
        return Collections.unmodifiableList(description);
    }

    public String getName() {
        return name;
    }
}
