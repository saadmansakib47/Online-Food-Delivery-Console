package factory;

import meal.Meal;
import meal.IndianBurger;
import meal.AmericanBurger;

public class BurgerFactory implements MealFactory 
{
    @Override
    public Meal createMeal(String type) 
    {
        if (type.equalsIgnoreCase("Indian")) 
        {
            return new IndianBurger();
        } 
        else if (type.equalsIgnoreCase("American")) 
        {
            return new AmericanBurger();
        } 
        else 
        {
            throw new IllegalArgumentException("Unknown Burger Type: " + type);
        }
    }
}
