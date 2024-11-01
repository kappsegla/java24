package se.iths.pizzaplace.decorators;

import se.iths.pizzaplace.pizza.Pizza;

import java.util.List;

public class JalapenoDecorator extends ToppingDecorator {

    public JalapenoDecorator(Pizza pizza) {
        super(pizza, "Jalapeno", 10, List.of("🌶️"));
    }
}
