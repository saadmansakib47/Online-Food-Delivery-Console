package core;

import meal.Meal;
import factory.MealFactory;
import factory.PizzaFactory;

public class Main 
{
    public static void main(String[] args) 
    {
        //This time Pizza factory only creates Italian Pizza 
        PizzaFactory pizzaFactory = new PizzaFactory();
        Meal meal = pizzaFactory.createMeal();
    } 
}