package core;

import meal.Meal;

import decorator.ExtraCheese;
import factory.PizzaFactory;

public class Main 
{
    public static void main(String[] args) 
    {
        //This time Pizza factory only creates Italian Pizza 
        PizzaFactory pizzaFactory = new PizzaFactory();
        Meal meal = pizzaFactory.createMeal();

        //Extra Cheese Topping 
        meal = new ExtraCheese(meal);

         System.out.println("Order: " + meal.getDescription());

        Order order = new Order();

        // Order Placed
        order.printStatus();

        // Move to Preparing
        order.nextState();
        order.printStatus();

        // Prepare the meal (Template Method)
        meal.prepareMeal();

        // Move to Dispatched
        order.nextState();
        order.printStatus();

        // Move to Delivered
        order.nextState();
        order.printStatus();

        System.out.println("Order processing completed.");
    } 
}