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

        order.printStatus();

        order.updateStatus(OrderStatus.PREPARING);
        order.printStatus();

        meal.prepareMeal();

        order.updateStatus(OrderStatus.DISPATCHED);
        order.printStatus();
        
        order.updateStatus(OrderStatus.DELIVERED);
        order.printStatus();

        System.out.println("Order processing completed.");
    } 
}