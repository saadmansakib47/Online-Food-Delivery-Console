package state;

import core.Order;

public class PreparingState implements OrderState 
{
    @Override
    public void next(Order order) 
    {
        System.out.println("Order is now dispatched...");
        order.setState(new DispatchedState());
    }

    @Override
    public String getStatus() 
    {
        return "Preparing";
    }
}
