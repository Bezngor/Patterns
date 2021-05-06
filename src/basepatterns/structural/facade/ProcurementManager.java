package basepatterns.structural.facade;

public class ProcurementManager {
    OrderTracker orderTracker;

    public ProcurementManager(OrderTracker orderTracker) {
        this.orderTracker = orderTracker;
    }

    public void makeOrder() {
        System.out.println("Procurement manager has made order.");
        orderTracker.insertOrder();
    }

    public void closeOrder() {
        System.out.println("Procurement manager has closed order.");
        orderTracker.completeOrder();
    }
}

