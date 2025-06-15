package core;

import meal.Meal;
import observer.DeliverySystem;
import decorator.ExtraCheese;
import factory.FactoryProducer;
import factory.MealFactory;

public class Main 
{
    public static void main(String[] args) 
    {
        String category = "Burger"; 
        String type = "Indian";   
        MealFactory factory = FactoryProducer.getFactory(category);

        Meal meal = factory.createMeal(type);

        meal = new ExtraCheese(meal);

        System.out.println("Order: " + meal.getDescription());

        // Order processing 
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
