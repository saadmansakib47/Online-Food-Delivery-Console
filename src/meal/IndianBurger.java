package meal;

public class IndianBurger extends Meal 
{
    @Override
    protected void prepareBase() 
    {
        System.out.println("Preparing spicy burger bun.");
    }

    @Override
    protected void addIngredients() 
    {
        System.out.println("Adding tandoori chicken patty, mint chutney, and fresh vegetables.");
    }

    @Override
    protected void cook() 
    {
        System.out.println("Grilling the tandoori chicken patty.");
    }

    @Override
    public String getDescription() 
    {
        return "Indian Burger with tandoori chicken patty, mint chutney, and fresh vegetables.";
    }

    @Override
    protected void pack() 
    {
        
    }
}
