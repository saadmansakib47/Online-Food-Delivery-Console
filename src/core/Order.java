package core;

import state.OrderState;
import state.PlacedState;
import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject
{
    private OrderState state;
    private List<Observer> observers = new ArrayList<>();
    
    public Order() 
    {
        this.state = new PlacedState();
    }

    public void nextState() 
    {
        state.next(this);
        notifyObservers();
    }

    public OrderState getState() 
    {
        return state;
    }

    public void setState(OrderState state) 
    {
        this.state = state;
    }

    @Override
    public void registerObserver(Observer observer) 
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) 
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() 
    {
        for (Observer observer : observers) 
        {
            observer.update(this);
        }
    }

    public void printStatus() 
    {
        System.out.println("Current Order Status: " + state.getStatus());
    }
}
