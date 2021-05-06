package basepatterns.structural.adapter;

public class DepartmentLogistic {

    public void getFromSuppliers() {
        System.out.println("Getting row materials from Suppliers...");
    }

    public void getFromWarehouse() {
        System.out.println("Getting goods from Warehouse for shipment to Buyers...");
    }

    public void giveToWarehouse() {
        System.out.println("Giving row materials to Warehouse...");
    }

    public void giveToBuyers() {
        System.out.println("Goods shipment to Buyers...");
    }
}
