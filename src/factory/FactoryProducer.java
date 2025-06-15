package factory;

public class FactoryProducer 
{
    public static MealFactory getFactory(String category) 
    {
        if (category.equalsIgnoreCase("Pizza")) 
        {
            return new PizzaFactory();
        } 
        else if (category.equalsIgnoreCase("Burger")) 
        {
            return new BurgerFactory();
        } 
        else if (category.equalsIgnoreCase("Pasta")) 
        {
            return new PastaFactory();
        } 
        else 
        {
            throw new IllegalArgumentException("Unknown Meal Category: " + category);
        }
    }
}
