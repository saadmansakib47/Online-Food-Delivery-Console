package state;
import core.Order;

public class DispatchedState implements OrderState 
{
    @Override
    public void next(Order order) 
    {
        System.out.println("Order is now delivered...");
        order.setState(new DeliveredState());
    }

    @Override
    public String getStatus() 
    {
        return "Dispatched";
    }
    
}