package meal;

public abstract class Meal 
{

    public void prepareMeal()
    {
        prepareBase();
        addIngredients();
        cook();
        pack();
    }

    protected abstract void prepareBase();
    protected abstract void addIngredients();
    protected abstract void cook();

    protected void pack()
    {
        System.out.println("Packing the meal for delivery.");
    }

    public abstract String getDescription();
}