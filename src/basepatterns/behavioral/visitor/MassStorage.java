package basepatterns.behavioral.visitor;

public class MassStorage implements ProductionElement {
    @Override
    public void executeStage(ManagerTeam managerTeam) {
        managerTeam.makeIt(this);
    }
}
