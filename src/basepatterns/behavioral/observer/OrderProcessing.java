package basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessing implements Observed {
    List<Observer> managers = new ArrayList<>();
    List<String> orders = new ArrayList<>();

    public void addOrder(String order) {
        orders.add(order);
        notifyObservers(orders);
    }

    public void removeOrder(String order) {
        orders.remove(order);
        notifyObservers(orders);
    }

    @Override
    public void addObserver(Observer manager) {
        managers.add(manager);
    }

    @Override
    public void removeObserver(Observer manager) {
        managers.remove(manager);
    }

    @Override
    public void notifyObservers(List<String> orders) {
        for (Observer observer : managers) {
            observer.handleEvent(orders);
        }
    }
}
