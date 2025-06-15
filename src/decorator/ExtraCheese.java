package decorator;

import meal.Meal;
public class ExtraCheese extends MealDecorator 
{
    public ExtraCheese(Meal meal) 
    {
        super(meal);
    }

    @Override
    public void prepareMeal()
    {
        meal.prepareMeal();
        System.out.println("Adding extra cheese to the meal.");
    }

   
    @Override
    public String getDescription() 
    {
        return meal.getDescription() + " with extra cheese.";
    }
}
