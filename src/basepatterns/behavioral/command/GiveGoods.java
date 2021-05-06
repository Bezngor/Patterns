package basepatterns.behavioral.command;

public class GiveGoods implements Command {
    Warehouse warehouse;

    public GiveGoods(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void execute() {
        warehouse.giveGoods();
    }
}
