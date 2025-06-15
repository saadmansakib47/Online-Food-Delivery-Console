package core;

import state.OrderState;
import state.PlacedState;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new PlacedState();
    }

    public void nextState() {
        state.next(this);
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void printStatus() {
        System.out.println("Current Order Status: " + state.getStatus());
    }
}
