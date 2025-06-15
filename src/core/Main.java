package core;

import meal.Meal;
import observer.DeliverySystem;
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
        DeliverySystem deliverySystem = new DeliverySystem();
        order.registerObserver(deliverySystem);

        // 'Placed' to 'Preparing' state
        order.nextState();

        // Prepare the meal (Template)
        meal.prepareMeal();

        // Move to Dispatched
        order.nextState();

        // Move to Delivered
        order.nextState();

        System.out.println("Order processing completed.");
    } 
}