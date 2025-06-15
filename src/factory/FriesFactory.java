package factory;

import meal.Meal;
import decorator.Fries;

public class FriesFactory implements DecoratorFactory
{
    @Override
    public Meal addTopping(Meal meal) 
    {
        return new Fries(meal);
    }
}
