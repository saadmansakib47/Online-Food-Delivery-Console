package core;

public class Order 
{
    private OrderStatus status;

    public Order() 
    {
        this.status = OrderStatus.PLACED;
    }

    public OrderStatus getStatus() 
    {
        return status;
    }

    public void updateStatus(OrderStatus status) 
    {
        this.status = status;
    }

    public void printStatus() 
    {
        System.out.println("Current Order Status: " + status);
    }
}
