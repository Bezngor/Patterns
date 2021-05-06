package basepatterns.behavioral.visitor;

public class Warehouse implements ProductionElement {
    @Override
    public void executeStage(ManagerTeam managerTeam) {
        managerTeam.makeIt(this);
    }
}
