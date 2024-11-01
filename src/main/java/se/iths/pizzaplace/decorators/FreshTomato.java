package se.iths.pizzaplace.decorators;

import se.iths.pizzaplace.pizza.Pizza;

import java.util.List;

public class FreshTomato extends ToppingDecorator{
    public FreshTomato(Pizza pizza) {
        super(pizza, "Fresh tomato", 5, List.of("🍅"));
    }
}
