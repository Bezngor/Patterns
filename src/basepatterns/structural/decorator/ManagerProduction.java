package basepatterns.structural.decorator;

public class ManagerProduction extends ManagerDecorator {

    public ManagerProduction(Manager manager) {
        super(manager);
    }

    public String carryOutPlan() {
        return "Carry out the plan. ";
    }

    @Override
    public String controlFunctions() {
        return super.controlFunctions() + carryOutPlan();
    }
}
