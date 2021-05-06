package basepatterns.structural.decorator;

public class Functional {
    public static void main(String[] args) {
        Manager manager = new ManagerProduction(new ManagerShift());

        System.out.println(manager.controlFunctions());
    }
}
