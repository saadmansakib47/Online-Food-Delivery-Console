package meal;

public class ItalianPizza extends Meal
{
    @Override
    protected void prepareBase() 
    {
        System.out.println("Preparing pizza dough.");
    }

    @Override
    protected void addIngredients() 
    {
        System.out.println("Adding tomato sauce, mozzarella cheese, and fresh basil.");
    }

    @Override
    protected void cook() 
    {
        System.out.println("Baking the pizza in a wood-fired oven.");
    }

    @Override
    public String getDescription() 
    {
        return "Italian Pizza with tomato sauce, mozzarella cheese, and fresh basil.";
    }
}
