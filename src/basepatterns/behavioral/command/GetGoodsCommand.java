package basepatterns.behavioral.command;

public class GetGoodsCommand implements Command {
    Warehouse warehouse;

    public GetGoodsCommand(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void execute() {
        warehouse.getGoods();
    }
}
