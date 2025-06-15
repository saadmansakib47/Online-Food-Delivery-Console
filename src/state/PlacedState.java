package state;

import core.Order;

public class PlacedState implements OrderState 
{
    @Override
    public void next(Order order) 
    {
        System.out.println("Order is now being prepared...");
        order.setState(new PreparingState());
    }

    @Override
    public String getStatus() 
    {
        return "Placed";
    }
}
