package basepatterns.behavioral.command;

public class GiveRawCommands implements Command {
    Warehouse warehouse;

    public GiveRawCommands(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void execute() {
        warehouse.giveRawMaterials();
    }
}
