package decorator;

import meal.Meal;
public class Fries extends MealDecorator 
{
    public Fries(Meal meal) 
    {
        super(meal);
    }

    @Override
    public void prepareMeal()
    {
        meal.prepareMeal();
        System.out.println("Adding french fries to the meal.");
    }

   
    @Override
    public String getDescription() 
    {
        return meal.getDescription() + " with french fries.";
    }
}
