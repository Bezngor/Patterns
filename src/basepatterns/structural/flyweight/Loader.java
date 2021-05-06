package basepatterns.structural.flyweight;

public class Loader implements Employee {
    @Override
    public void executeFunctional() {
        System.out.println("Loader loads boxes into track...");
    }

    @Override
    public String toString() {
        return "Loader";
    }
}
