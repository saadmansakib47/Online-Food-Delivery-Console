package meal;

public class AmericanBurger extends Meal 
{
    @Override
    protected void prepareBase() 
    {
        System.out.println("Preparing burger bun.");
    }

    @Override
    protected void addIngredients() 
    {
        System.out.println("Adding chicken patty, mint, and fresh vegetables.");
    }

    @Override
    protected void cook() 
    {
        System.out.println("Grilling the chicken patty.");
    }

    @Override
    public String getDescription() 
    {
        return "American Burger with chicken patty, mint, and fresh vegetables.";
    }
}
