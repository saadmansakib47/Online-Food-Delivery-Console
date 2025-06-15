package core;

import meal.Meal;
import observer.DeliverySystem;
import factory.DecoratorFactory;
import factory.FactoryProducer;
import factory.MealFactory;
import factory.ToppingFactoryProducer;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Meal Category Input
        System.out.print("Enter meal category (Pizza / Burger / Pasta): ");
        String category = scanner.nextLine();

        // Cuisine Type Input
        System.out.print("Enter cuisine type (Indian / American / Italian): ");
        String type = scanner.nextLine();

        // dynamically retreving the factory
        MealFactory factory = FactoryProducer.getFactory(category);
        Meal meal = factory.createMeal(type);

        // Topping input (multiple can be added)
        System.out.println("Do you want to add toppings? (y/n): ");
        String toppingChoice = scanner.nextLine();

        while (toppingChoice.equalsIgnoreCase("y")) 
        {
            System.out.print("Enter topping name (ExtraCheese / ExtraSauce / Fries): ");
            String toppingName = scanner.nextLine();

            try 
            {
                DecoratorFactory toppingFactory = ToppingFactoryProducer.getToppingFactory(toppingName);
                meal = toppingFactory.addTopping(meal);
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println("Unknown topping. Please try again.");
            }

            System.out.println("Do you want to add more toppings? (y/n): ");
            toppingChoice = scanner.nextLine();
        }

        System.out.println("\nOrder: " + meal.getDescription());


        // Order Processing
        Order order = new Order();
        DeliverySystem deliverySystem = new DeliverySystem();
        order.registerObserver(deliverySystem);

        order.nextState();  // Placed -> Preparing
        meal.prepareMeal(); // Prepare the meal
        order.nextState();  // Preparing -> Dispatched
        order.nextState();  // Dispatched -> Delivered

        System.out.println("\nOrder processing completed.");
    }
}
