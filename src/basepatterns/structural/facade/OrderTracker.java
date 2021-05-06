package basepatterns.structural.facade;

public class OrderTracker {
    private boolean activeOrder;

    public boolean isActiveOrder() {
        return activeOrder;
    }

    public void insertOrder() {
        System.out.println("There is active order.");
        activeOrder = true;
    }

    public void completeOrder() {
        System.out.println("Order is completed. There isn't active order.");
        activeOrder = false;
    }
}
