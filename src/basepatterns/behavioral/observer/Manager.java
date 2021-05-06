package basepatterns.behavioral.observer;

import java.util.List;

public class Manager implements Observer {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> orders) {
        System.out.println("Attention! There is a new order!\nOrders:" + orders +
                "\n=======================\n");
    }
}
