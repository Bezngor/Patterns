package basepatterns.structural.facade;

public class LogisticManager {
    OrderTracker orderTracker;

    public LogisticManager(OrderTracker orderTracker) {
        this.orderTracker = orderTracker;
    }

    public void executingOrder() {
        if (orderTracker.isActiveOrder()) {
            System.out.println("Logistic manager executes order.");
        } else {
            System.out.println("Logistic manager waits for order.");
        }
    }
}
