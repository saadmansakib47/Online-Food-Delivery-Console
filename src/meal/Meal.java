package meal;

public abstract class Meal 
{

    public void prepareMeal()
    {
        prepareBase();
        waitforNextStep();

        addIngredients();
        waitforNextStep();

        cook();
        waitforNextStep();

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

    public void waitforNextStep()
    {
        try 
        {
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e) 
        {
            System.out.println("An error occurred while waiting for the next step.");
        }
    }

    
}