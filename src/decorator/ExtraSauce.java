package decorator;

import meal.Meal;
public class ExtraSauce extends MealDecorator 
{
    public ExtraSauce(Meal meal) 
    {
        super(meal);
    }

    @Override
    public void prepareMeal()
    {
        meal.prepareMeal();
        System.out.println("Adding extra sauce to the meal.");
    }

   
    @Override
    public String getDescription() 
    {
        return meal.getDescription() + " with extra sauce.";
    }
}
