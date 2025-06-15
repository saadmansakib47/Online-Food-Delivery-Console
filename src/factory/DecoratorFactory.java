package factory;

import meal.Meal;

public interface DecoratorFactory 
{
    Meal addTopping(Meal meal);
}
