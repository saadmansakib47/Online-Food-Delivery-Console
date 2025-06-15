package decorator;
import meal.Meal;
public abstract class MealDecorator extends Meal 
{
    protected Meal meal;

    public MealDecorator(Meal meal) 
    {
        this.meal = meal;
    }

    @Override
    protected void prepareBase() 
    {
        prepareBase();
    }

    @Override
    protected void addIngredients() 
    {
        addIngredients();
    }

    @Override
    protected void cook() 
    {
        cook();
    }
}