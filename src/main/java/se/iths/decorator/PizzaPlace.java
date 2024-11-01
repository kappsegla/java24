package se.iths.decorator;

public class PizzaPlace {

    public static void main(String[] args) {
        Pizza pizza = new Margaritha();

        System.out.println("You have ordered a " + pizza.getName());
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Total cost: " + pizza.getCost());

    }



}
