package basepatterns.structural.decorator;

public class ManagerDecorator implements Manager{
    Manager manager;

    public ManagerDecorator(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String controlFunctions() {
        return manager.controlFunctions();
    }
}
