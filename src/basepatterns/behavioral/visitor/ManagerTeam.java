package basepatterns.behavioral.visitor;

public interface ManagerTeam {
    void makeIt(MassStorage massStorage);

    void makeIt(FillingEquipment fillingEquipment);

    void makeIt(Warehouse warehouse);
}
