package basepatterns.behavioral.command;

public class GetRawCommand implements Command{
    Warehouse warehouse;

    public GetRawCommand(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void execute() {
        warehouse.getRawMaterials();
    }
}
