package decorator;

import meal.Meal;
public class Mushroom extends MealDecorator 
{
    public Mushroom(Meal meal) 
    {
        super(meal);
    }

    @Override
    public void prepareMeal()
    {
        meal.prepareMeal();
        System.out.println("Adding sauteed mushroom to the meal.");
    }

   
    @Override
    public String getDescription() 
    {
        return meal.getDescription() + " with sauteed mushroom.";
    }
}
