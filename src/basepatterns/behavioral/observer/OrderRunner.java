package basepatterns.behavioral.observer;

public class OrderRunner {
    public static void main(String[] args) {
        OrderProcessing orderProcessing = new OrderProcessing();

        orderProcessing.addOrder("Order #1");
        orderProcessing.addOrder("Order #2");

        Observer manager1 = new Manager("Manager 1");
        Observer manager2 = new Manager("Manager 2");

        orderProcessing.addObserver(manager1);
        orderProcessing.addObserver(manager2);

        orderProcessing.addOrder("Order #3");

        orderProcessing.removeOrder("Order #2");
    }
}
