package basepatterns.behavioral.visitor;

public class ManagerNightTeam implements ManagerTeam {
    @Override
    public void makeIt(MassStorage massStorage) {
        System.out.println("Use soap mass.");
    }

    @Override
    public void makeIt(FillingEquipment fillingEquipment) {
        System.out.println("Use automatic filling line.");
    }

    @Override
    public void makeIt(Warehouse warehouse) {
        System.out.println("Move to warehouse #2.");
    }
}
