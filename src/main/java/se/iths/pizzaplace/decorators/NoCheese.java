package se.iths.pizzaplace.decorators;

import se.iths.pizzaplace.pizza.Pizza;

import java.util.List;

public class NoCheese extends ToppingDecorator {

    public NoCheese(Pizza pizza) {
        super(pizza, "No Cheese", 0, List.of("🧀"));
    }

    @Override
    public List<String> getDescription() {
        List<String> defaultIngredients = super.getDescription();
        return defaultIngredients.stream()
                .filter(topping -> !extraToppings.contains(topping))
                .toList();
    }
}
