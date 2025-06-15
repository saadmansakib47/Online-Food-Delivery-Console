package factory;

public class ToppingFactoryProducer 
{
    public static DecoratorFactory getToppingFactory(String toppingName) 
    {
        if (toppingName.equalsIgnoreCase("ExtraCheese")) 
        {
            return new ExtraCheeseFactory();
        } 
        else if (toppingName.equalsIgnoreCase("ExtraSauce")) 
        {
            return new ExtraSauceFactory();
        } 
        else if (toppingName.equalsIgnoreCase("Fries")) 
        {
            return new FriesFactory();
        } 
        else 
        {
            throw new IllegalArgumentException("Unknown Topping: " + toppingName);
        }
    }
}
