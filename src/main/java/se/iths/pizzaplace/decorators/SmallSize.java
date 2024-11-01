package se.iths.pizzaplace.decorators;

import se.iths.pizzaplace.pizza.Pizza;

import java.util.List;

public class SmallSize extends ToppingDecorator{
    public SmallSize(Pizza pizza) {
        super(pizza, "Size small", 0, List.of());
    }

    @Override
    public int getCost() {
        return (int)(super.getCost() * 0.6);
    }
}
