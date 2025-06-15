package state;

import core.Order;

public interface OrderState 
{
    void next(Order order);
    String getStatus();
}
