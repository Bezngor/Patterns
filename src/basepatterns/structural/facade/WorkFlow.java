package basepatterns.structural.facade;

public class WorkFlow {
    OrderTracker orderTracker = new OrderTracker();
    ProcurementManager procurementManager = new ProcurementManager(orderTracker);
    LogisticManager logisticManager = new LogisticManager(orderTracker);

    public void processOrder() {
        procurementManager.makeOrder();
        logisticManager.executingOrder();
    }

    public void finishOrder() {
        procurementManager.closeOrder();
        logisticManager.executingOrder();
    }
}
