package basepatterns.structural.bridge;

public class OperatorOfReactor implements Operator {
    private String name;

    public OperatorOfReactor(String name) {
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
