package factory;

import meal.Meal;
import decorator.ExtraSauce;

public class ExtraSauceFactory implements DecoratorFactory 
{
    @Override
    public Meal addTopping(Meal meal) 
    {
        return new ExtraSauce(meal);
    }
}
