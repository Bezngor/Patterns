package basepatterns.behavioral.visitor;

public class FillingEquipment implements ProductionElement {
    @Override
    public void executeStage(ManagerTeam managerTeam) {
        managerTeam.makeIt(this);
    }
}
