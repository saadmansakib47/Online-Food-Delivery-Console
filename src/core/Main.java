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
    private static void waitforNextStep() 
    {
        try 
        {
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e) 
        {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Meal Category Input
        System.out.print("\nEnter meal category (Pizza / Burger / Pasta): \n");
        String category = scanner.nextLine();

        // Cuisine Type Input
        System.out.print("\nEnter cuisine type (Indian / American / Italian): \n");
        String type = scanner.nextLine();

        // dynamically retreving the factory
        MealFactory factory = FactoryProducer.getFactory(category);
        Meal meal = factory.createMeal(type);

        // Topping input (multiple can be added)
        System.out.println("\nDo you want add-ons? (y/n): \n");
        String toppingChoice = scanner.nextLine();

        while (toppingChoice.equalsIgnoreCase("y")) 
        {
            System.out.print("Choose item name (ExtraCheese / ExtraSauce / Fries / Salad / Mushroom / SoftDrink): ");
            String toppingName = scanner.nextLine();

            try 
            {
                DecoratorFactory toppingFactory = ToppingFactoryProducer.getToppingFactory(toppingName);
                meal = toppingFactory.addTopping(meal);
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println("Unknown add-on. Please try again.");
            }

            System.out.println("Do you want to add more add-ons? (y/n): ");
            toppingChoice = scanner.nextLine();
        }

        System.out.println("\nOrder: " + meal.getDescription());


        // Order Processing
        Order order = new Order();
        DeliverySystem deliverySystem = new DeliverySystem();
        order.registerObserver(deliverySystem);

        order.nextState(); // Placed -> Preparing
        waitforNextStep(); 

        meal.prepareMeal();
        waitforNextStep(); // Prepare the meal
        
        order.nextState();
        waitforNextStep(); // Preparing -> Dispatched
        
        order.nextState();  
        waitforNextStep(); // Dispatched -> Delivered

        

        System.out.println("\nOrder processing completed.");

        
    }
}
