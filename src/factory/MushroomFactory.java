package factory;
import meal.Meal;
import decorator.Mushroom;
public class MushroomFactory implements DecoratorFactory 
{
    @Override
    public Meal addTopping(Meal meal) 
    {
        return new Mushroom(meal);
    }
}
