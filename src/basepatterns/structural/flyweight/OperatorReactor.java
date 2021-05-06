package basepatterns.structural.flyweight;

public class OperatorReactor implements Employee {
    @Override
    public void executeFunctional() {
        System.out.println("Operator of reactor makes mass...");
    }

    @Override
    public String toString() {
        return "OperatorReactor";
    }
}
