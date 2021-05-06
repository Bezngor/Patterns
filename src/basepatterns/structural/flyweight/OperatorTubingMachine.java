package basepatterns.structural.flyweight;

public class OperatorTubingMachine implements Employee {
    @Override
    public void executeFunctional() {
        System.out.println("Operator of Tubing machine makes tube...");
    }

    @Override
    public String toString() {
        return "OperatorTubingMachine";
    }
}
