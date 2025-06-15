package observer;

import core.Order;

public class DeliverySystem implements Observer 
{
    public void update(Order order)
    {
        System.out.println("Delivery System: Order status changed to " + order.getState().getStatus());
    }
}
