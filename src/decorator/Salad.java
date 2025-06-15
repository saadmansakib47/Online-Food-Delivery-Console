package decorator;

import meal.Meal;
public class Salad extends MealDecorator 
{
    public Salad(Meal meal) 
    {
        super(meal);
    }

    @Override
    public void prepareMeal()
    {
        meal.prepareMeal();
        System.out.println("Adding garden-fresh salad to the meal.");
    }

   
    @Override
    public String getDescription() 
    {
        return meal.getDescription() + " with garden-fresh salad.";
    }
}
