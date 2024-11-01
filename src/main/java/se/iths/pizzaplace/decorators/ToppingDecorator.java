package se.iths.pizzaplace.decorators;

import se.iths.pizzaplace.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class ToppingDecorator implements Pizza {

    private final Pizza pizza;
    private final String toppingName;
    private final int cost;
    protected final List<String> extraToppings = new ArrayList<>();


    public ToppingDecorator(Pizza pizza, String toppingName, int cost, List<String> extraToppings) {
        this.pizza = pizza;
        this.toppingName = toppingName;
        this.cost = cost;
        this.extraToppings.addAll(extraToppings);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + cost;
    }

    @Override
    public List<String> getDescription() {
        return Stream.concat(pizza.getDescription().stream(),
                extraToppings.stream()).toList();
    }

    @Override
    public String getName() {
        return pizza.getName() + " with " + toppingName;
    }
}
