package factory;

import meal.Meal;
import meal.AmericanPasta;
public class PastaFactory implements MealFactory 
{

    @Override
    public Meal createMeal(String type) 
    {
        return new AmericanPasta();
    }    
}
