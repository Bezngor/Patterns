package basepatterns.behavioral.visitor;

public class Production implements ProductionElement {
    ProductionElement[] productionElements = new ProductionElement[] {
            new MassStorage(),
            new FillingEquipment(),
            new Warehouse()
    };

    @Override
    public void executeStage(ManagerTeam managerTeam) {
        for (ProductionElement element : productionElements) {
            element.executeStage(managerTeam);
        }
    }
}
