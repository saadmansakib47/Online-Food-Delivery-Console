package factory;
import meal.Meal;
import decorator.SoftDrink;
public class SoftDrinkFactory implements DecoratorFactory 
{
    @Override
    public Meal addTopping(Meal meal) 
    {
        return new SoftDrink(meal);
    }
}
