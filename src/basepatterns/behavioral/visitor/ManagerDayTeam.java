package basepatterns.behavioral.visitor;

public class ManagerDayTeam implements ManagerTeam {
    @Override
    public void makeIt(MassStorage massStorage) {
        System.out.println("Use cream mass.");
    }

    @Override
    public void makeIt(FillingEquipment fillingEquipment) {
        System.out.println("Use tubing machine.");
    }

    @Override
    public void makeIt(Warehouse warehouse) {
        System.out.println("Move tu warehouse #1");
    }
}
