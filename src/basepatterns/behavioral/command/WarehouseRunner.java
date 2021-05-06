package basepatterns.behavioral.command;

public class WarehouseRunner {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Storekeeper storekeeper = new Storekeeper(
                new GetRawCommand(warehouse),
                new GetGoodsCommand(warehouse),
                new GiveRawCommands(warehouse),
                new GiveGoods(warehouse)
        );

        storekeeper.getRowMaterials();
        storekeeper.getGoods();
        storekeeper.giveRawMaterials();
        storekeeper.giveGoods();
    }
}
