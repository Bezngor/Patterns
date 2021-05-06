package basepatterns.structural.adapter;

public class WarehouseWorker {
    public static void main(String[] args) {
        Warehouse warehouse = new AdapterLogisticToWarehouse();

        warehouse.getGoods();
        warehouse.getRowMaterials();
        warehouse.giveGoods();
        warehouse.giveRowMaterials();

        System.out.println();

        warehouse = new AdapterProductionToWarehouse();

        warehouse.getRowMaterials();
        warehouse.giveGoods();
    }


}
