package se.iths.pizzaplace;

import se.iths.pizzaplace.decorators.FreshTomato;
import se.iths.pizzaplace.decorators.JalapenoDecorator;
import se.iths.pizzaplace.decorators.NoCheese;
import se.iths.pizzaplace.decorators.SmallSize;
import se.iths.pizzaplace.pizza.Margaritha;
import se.iths.pizzaplace.pizza.Pizza;

public class PizzaPlace {

    public static void main(String[] args) {
        Pizza pizza = new Margaritha();
        pizza = new JalapenoDecorator(pizza);
        pizza = new FreshTomato(pizza);
        pizza = new NoCheese(pizza);
        pizza = new SmallSize(pizza);

        System.out.println("You have ordered a " + pizza.getName());
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Total cost: " + pizza.getCost());
    }
}
