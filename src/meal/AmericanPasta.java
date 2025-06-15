package meal;

public class AmericanPasta extends Meal 
{
    @Override
    protected void prepareBase() 
    {
        System.out.println("Boiling pasta.");
    }

    @Override
    protected void addIngredients() 
    {
        System.out.println("Adding creamy Alfredo sauce, grilled chicken, and mushrooms.");
    }

    @Override
    protected void cook() 
    {
        System.out.println("Cooking pasta and sauce together.");
    }

    @Override
    public String getDescription() 
    {
        return "American Pasta with creamy Alfredo sauce, grilled chicken, and mushrooms.";
    }

    @Override
    protected void pack() 
    {

    }
}
