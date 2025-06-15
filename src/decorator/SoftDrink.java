package decorator;

import meal.Meal;
public class SoftDrink extends MealDecorator 
{
    public SoftDrink(Meal meal) 
    {
        super(meal);
    }

    @Override
    public void prepareMeal()
    {
        meal.prepareMeal();
        System.out.println("Adding soft drink to the meal.");
    }

   
    @Override
    public String getDescription() 
    {
        return meal.getDescription() + " with soft drink.";
    }
}
