package basepatterns.structural.facade;

public class OrderRunner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();

        workFlow.processOrder();
        System.out.println("\n==========================\n");
        workFlow.finishOrder();
    }
}
