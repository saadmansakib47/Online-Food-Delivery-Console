package factory;

import meal.Meal;
import meal.IndianBurger;
public class BurgerFactory implements MealFactory 
{

    @Override
    public Meal createMeal() 
    {
        return new IndianBurger();
    }    
}

