package basepatterns.structural.bridge;

public class OperatorOfTubingMachine implements Operator {
    String name;

    public OperatorOfTubingMachine(String name) {
        this.name = name;
    }

    @Override
    public void produce() {
        System.out.println("Operator " + name + " in progress...");
    }

    @Override
    public String toString() {
        return name;
    }
}
