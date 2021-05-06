package basepatterns.structural.adapter;

public class AdapterProductionToWarehouse extends DepartmentProduction implements Warehouse {
    @Override
    public void getRowMaterials() {
        getFromWarehouse();
    }

    @Override
    public void getGoods() {
        getForRecycling();
    }

    @Override
    public void giveRowMaterials() {
        giveForReturn();
    }

    @Override
    public void giveGoods() {
        giveToWarehouse();
    }
}
