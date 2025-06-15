package factory;

import meal.Meal;
import decorator.ExtraCheese;

public class ExtraCheeseFactory implements DecoratorFactory 
{
    @Override
    public Meal addTopping(Meal meal) 
    {
        return new ExtraCheese(meal);
    }
}
