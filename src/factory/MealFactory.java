package factory;

import meal.Meal;

public interface MealFactory 
{
    Meal createMeal(String type);
}
