package factory;

import meal.Meal;
import decorator.Salad;

public class SaladFactory implements DecoratorFactory 
{
    @Override
    public Meal addTopping(Meal meal) 
    {
        return new Salad(meal);
    }
}
