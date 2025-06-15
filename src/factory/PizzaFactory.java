package factory;

import meal.Meal;
import meal.ItalianPizza;
public class PizzaFactory implements MealFactory 
{

    @Override
    public Meal createMeal(String type) 
    {
        return new ItalianPizza();
    }    
}
