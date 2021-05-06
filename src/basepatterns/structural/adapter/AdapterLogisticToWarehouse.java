package basepatterns.structural.adapter;

public class AdapterLogisticToWarehouse extends DepartmentLogistic implements Warehouse {
    @Override
    public void getRowMaterials() {
        getFromSuppliers();
    }

    @Override
    public void getGoods() {
        getFromWarehouse();
    }

    @Override
    public void giveRowMaterials() {
        giveToWarehouse();
    }

    @Override
    public void giveGoods() {
        giveToBuyers();
    }
}
